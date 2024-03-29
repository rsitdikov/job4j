package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class SortIncreaseByItemNameTest {

    @Test
    public void whenTheOrderSecondThirdFirst() {
        Item first = new Item("5");
        Item second = new Item("3");
        Item third = new Item("4");
        first.setId("000");
        second.setId("000");
        third.setId("000");
        List<Item> items = Arrays.asList(first, second, third);
        List<Item> expected = Arrays.asList(second, third, first);
        Collections.sort(items, new SortIncreaseByItemName());
        assertEquals(expected, items);
    }
}