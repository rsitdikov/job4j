package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 1200, 1);
        assertEquals(year, 1);
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 120, 50);
        assertEquals(year, 2);
    }
    @Test
    public void when4Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 40, 20);
        assertEquals(year, 4);
    }

}