package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {

        User user = findByPassport(passport);
        if (user != null && users.get(user).indexOf(account) == -1) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        return users.entrySet()
                .stream()
                .filter(m -> m.getKey().getPassport().equals(passport))
                .map(Map.Entry::getValue)
                .flatMap(List :: stream)
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            rsl = true;
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
        }
        return rsl;
    }
}