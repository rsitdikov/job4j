package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        MemTracker tracker = new MemTracker();
        new  CreateAction().execute(input, tracker, System.out::println);
        Item created = tracker.findAll().get(0);
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    @Test
    public void whenReplaceItem() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        new ReplaceAction().execute(new StubInput(answers), tracker, System.out::println);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
    @Test
    public void whenDeleteItem() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId()};
        new DeleteAction().execute(new StubInput(answers), tracker, System.out::println);
        Item deleted = tracker.findById(answers[0]);
        assertThat(deleted, is(nullValue()));
    }
    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI(input, new MemTracker(), System.out::println).init(new UserAction[] {action});
        assertThat(action.isCall(), is(true));
    }
    @Test
    public void whenPrtMenu() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI(input, new MemTracker(), System.out::println).init(new UserAction[] {action});
        String expect = new StringBuilder()
                .append("Menu.")
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("0. Stub action")
                .append(System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()),
                    is(expect));
        System.setOut(stdout);
    }
}