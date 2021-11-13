package ru.job4j.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertArrayEquals(rsl, expected);
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertArrayEquals(rsl, expected);
    }
}