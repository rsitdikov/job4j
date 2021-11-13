package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueTextTest {

    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertTrue(UniqueText.isEquals(origin, text));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertFalse(UniqueText.isEquals(origin, text));
    }
}