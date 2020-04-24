package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = Optional.ofNullable(findByPassport(passport));
        if (user.isPresent() && users.get(user.get()).indexOf(account) == -1) {
            users.get(user.get()).add(account);
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
        Optional<Account> src = Optional.ofNullable(findByRequisite(srcPassport, srcRequisite));
        Optional<Account> dest = Optional.ofNullable(findByRequisite(destPassport, destRequisite));
        if (src.isPresent() && dest.isPresent() && src.get().getBalance() >= amount) {
            rsl = true;
            src.get().setBalance(src.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
        }
        return rsl;
    }
}