package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ItemTest {

    @Test
    public void whenTheOrderThirdSecondFirst() {
        Item first = new Item("000");
        Item second = new Item("000");
        Item third = new Item("000");
        first.setId("5");
        second.setId("4");
        third.setId("3");
        List<Item> items = Arrays.asList(first, second, third);
        List<Item> expected = Arrays.asList(third, second, first);
        Collections.sort(items);
        assertThat(expected, is(items));
    }
    @Test
    public void whenTheOrderFirstSecondThird() {
        Item first = new Item("000");
        Item second = new Item("000");
        Item third = new Item("000");
        first.setId("5");
        second.setId("4");
        third.setId("3");
        List<Item> items = Arrays.asList(first, second, third);
        List<Item> expected = Arrays.asList(first, second, third);
        Collections.sort(items, Collections.reverseOrder());
        assertThat(expected, is(items));
    }
}