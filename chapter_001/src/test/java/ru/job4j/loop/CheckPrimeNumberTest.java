package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertTrue(rsl);
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertFalse(rsl);
    }
    @Test
    public void when101() {
        boolean rsl = CheckPrimeNumber.check(101);
        assertTrue(rsl);
    }

}
