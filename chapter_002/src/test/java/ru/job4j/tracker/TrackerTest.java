package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;


public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertEquals(result.getName(), item.getName());
    }

    @Test
    public void whenFindAllThenTrackerHas10Items() {
        MemTracker tracker = new MemTracker();
        Random rm = new Random();
        for (int index = 0; index < 10; index++) {
            Item item = new Item(String.valueOf(rm.nextLong()));
            tracker.add(item);
        }
        List<Item> result = tracker.findAll();
        assertEquals(result.size(), 10);
    }
    @Test
    public void whenFindNameTestThenTrackerHas10Items() {
        MemTracker tracker = new MemTracker();
        Random rm = new Random();
        for (int index = 0; index < 10; index++) {
            Item item = new Item(String.valueOf(rm.nextLong()));
            tracker.add(item);
            item = new Item("Test");
            tracker.add(item);
        }
        List<Item> result = tracker.findByName("Test");
        assertEquals(result.size(), 10);
    }
    @Test
    public void whenAddNewItemToTrackerThenItemHasSameId() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("Test");
        tracker.add(item);
        String answer = item.getId();
        Item result = tracker.findById(answer);
        assertEquals(result, item);
    }
    @Test
    public void whenReplace() {
        MemTracker tracker = new MemTracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertEquals(tracker.findById(id).getName(), "Bug with description");
    }
    @Test
    public void whenDelete() {
        MemTracker tracker = new MemTracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertEquals(tracker.findById(id), null);
    }
}