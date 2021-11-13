package ru.job4j.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = List.of(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        Set<String> expected = new HashSet<>(List.of("1", "2"));
        assertEquals(FullSearch.extractNumber(tasks), expected);
    }
}
