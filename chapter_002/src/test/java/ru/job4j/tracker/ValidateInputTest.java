package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"one", "1"})
        );
        input.askInt("Enter");
        assertEquals(
                mem.toString(),
                String.format("Please enter validate data again.%n")
        );
        System.setOut(out);
    }
    @Test
    public void whenSelectGreaterMax() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        int max = 5;
        String select = Integer.toString(max + 1);
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {select, "0"})
        );
        input.askInt("Enter", max);
        assertEquals(
                mem.toString(),
                String.format("Please select key from menu.%n")
        );
        System.setOut(out);
    }
}
