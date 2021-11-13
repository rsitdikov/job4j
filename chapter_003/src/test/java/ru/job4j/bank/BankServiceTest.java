package ru.job4j.bank;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertEquals(bank.findByPassport("3434").get(), user);
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        assertTrue(bank.findByRequisite("3434", "5546").get().getBalance() == 150.0);
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        bank.addAccount(user.getPassport(), new Account("113", 50));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150);
        assertEquals(bank.findByRequisite("3434", "113").get().getBalance(), 200.0, 0.0001);
    }
}