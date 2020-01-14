package ru.job4j.loop;

import org.junit.Test;

import  static org.hamcrest.core.Is.is;
import  static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial check = new Factorial();
        int n = 5;
        int expected = 120;
        int result = check.calc(n);
        assertThat(result, is(expected));

    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial check = new Factorial();
        int n = 0;
        int expected = 1;
        int result = check.calc(n);
        assertThat(result, is(expected));
    }
}
