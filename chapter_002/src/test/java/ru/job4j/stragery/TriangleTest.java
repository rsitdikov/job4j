package ru.job4j.stragery;

import org.junit.Test;
import java.util.StringJoiner;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertEquals(
                triangle.draw(),
                (
                        new StringJoiner(System.lineSeparator())
                                .add("   +   ")
                                .add("  + +  ")
                                .add(" +   + ")
                                .add("+++++++")
                                .toString()
                )
        );
    }
}
