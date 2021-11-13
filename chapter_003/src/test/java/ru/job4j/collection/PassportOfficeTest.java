package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertEquals(office.get(citizen.getPassport()), citizen);
    }
    @Test
    public void whenAddIsTrue() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        boolean result = office.add(citizen);
        assertTrue(result);
    }
    @Test
    public void whenAddIsFalse() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        boolean result = office.add(citizen);
        assertFalse(result);
    }
}