package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertEquals(MinDiapason.findMin(new int[] {-1, 0, 5, 10}, 1, 3), 0);
    }

    @Test
    public void whenLastMin() {
        assertEquals(MinDiapason.findMin(new int[] {10, 5, 3, 1}, 1, 3), 1);
    }

    @Test
    public void whenMiddleMin() {
        assertEquals(MinDiapason.findMin(new int[] {10, 2, 5, 1}, 0, 2), 2);
    }
}