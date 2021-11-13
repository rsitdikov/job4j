package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FindAllActionTest {

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        MemTracker tracker = new MemTracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindAllAction act = new FindAllAction();
        act.execute(new StubInput(new String[] {}), tracker, System.out::println);
        String expect = new StringBuilder()
                .append(tracker.findAll().size())
                .append(" item(s) found.")
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Name: ")
                .append(item.getName())
                .append(System.lineSeparator())
                .append("Id: ")
                .append(item.getId())
                .append(System.lineSeparator())
                .toString();
        assertEquals(new String(out.toByteArray()), expect);
        System.setOut(def);
    }
}