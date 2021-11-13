package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertEquals(Min.findMin(new int[] {0, 5, 10}), 0);
    }

    @Test
    public void whenLastMin() {
        assertEquals(Min.findMin(new int[] {10, 5, 3}), 3);
    }

    @Test
    public void whenMiddleMin() {
        assertEquals(Min.findMin(new int[] {10, 2, 5}), 2);
    }
}