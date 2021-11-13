package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class FreezeStrTest {

    @Test
    public void whenEq() {
        assertTrue(FreezeStr.eq("Hello", "Hlloe"));
    }

    @Test
    public void whenNotEq() {
        assertFalse(FreezeStr.eq("Hello", "Halle"));
    }

    @Test
    public void whenNotMultiEq() {
        assertFalse(FreezeStr.eq("heloo", "hello"));
    }
}