package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNum0ThenIllegalArgumentException() {
        Fact fact = new Fact();
        int result = fact.calc(0);
    }
}
