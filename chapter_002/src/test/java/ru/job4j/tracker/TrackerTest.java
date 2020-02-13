package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;


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
        List<Item> result = tracker.findAll();
        assertThat(result.toArray(), arrayWithSize(10));
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
        List<Item> result = tracker.findByName("Test");
        assertThat(result.toArray(), arrayWithSize(10));
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
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}