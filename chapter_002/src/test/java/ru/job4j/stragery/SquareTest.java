package ru.job4j.stragery;

import org.junit.Test;
        import java.util.StringJoiner;
        import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertEquals(
                square.draw(),
                (
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+  +")
                                .add("+  +")
                                .add("++++")
                                .toString()
                )
        );
    }
}
