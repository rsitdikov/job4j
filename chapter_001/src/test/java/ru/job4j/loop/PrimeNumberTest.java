package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertEquals(count, 3);
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertEquals(count, 5);
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertEquals(count, 1);
    }
    @Test
    public void when199() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(199);
        assertEquals(count, 46);
    }
}