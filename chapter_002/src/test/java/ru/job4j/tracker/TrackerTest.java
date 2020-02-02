package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import java.util.Random;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllThenTrackerHas10Items() {
        Tracker tracker = new Tracker();
        Random rm = new Random();
        for (int index = 0; index < 10; index++) {
            Item item = new Item(String.valueOf(rm.nextLong()));
            tracker.add(item);
        }
        Item[] result = tracker.findAll();
        assertThat(result, arrayWithSize(10));
    }
    @Test
    public void whenFindNameTestThenTrackerHas10Items() {
        Tracker tracker = new Tracker();
        Random rm = new Random();
        for (int index = 0; index < 10; index++) {
            Item item = new Item(String.valueOf(rm.nextLong()));
            tracker.add(item);
            item = new Item("Test");
            tracker.add(item);
        }
        Item[] result = tracker.findByName("Test");
        assertThat(result, arrayWithSize(10));
    }
    @Test
    public void whenAddNewItemToTrackerThenItemHasSameId() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test");
        tracker.add(item);
        String answer = item.getId();
        Item result = tracker.findById(answer);
        assertThat(result, is(item));
    }

}