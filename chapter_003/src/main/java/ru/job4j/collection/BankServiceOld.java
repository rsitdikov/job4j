package ru.job4j.collection;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankServiceOld {
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
//        User rsl = null;
//        for (User user : users.keySet()) {
//            if (user.getPassport().equals(passport)) {
//               rsl = user;
//               break;
//            }
//        }
//        return rsl;
        return users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
//        Account rsl = null;
//        User user = findByPassport(passport);
//        if (user != null) {
//            for (Account account : users.get(user)) {
//                if (account.getRequisite().equals(requisite)) {
//                    rsl = account;
//                    break;
//                }
//            }
//        }
//        return rsl;
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