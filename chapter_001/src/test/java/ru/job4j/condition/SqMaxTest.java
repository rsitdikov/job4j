package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenMaxFirst() {
        int first = 4, second = 3, third = 2, four = 1;
        int expected = 4;
        int s = SqMax.max(first, second, third, four);
        assertThat(s, is(expected));
    }

    @Test
    public void whenMaxSecond() {
        int first = 3, second = 4, third = 2, four = 1;
        int expected = 4;
        int s = SqMax.max(first, second, third, four);
        assertThat(s, is(expected));
    }
    @Test
    public void whenMaxThird() {
        int first = 3, second = 5, third = 6, four = 1;
        int expected = 6;
        int s = SqMax.max(first, second, third, four);
        assertThat(s, is(expected));
    }
    @Test
    public void whenMaxFour() {
        int first = 3, second = 2, third = 1, four = 4;
        int expected = 4;
        int s = SqMax.max(first, second, third, four);
        assertThat(s, is(expected));
    }
}