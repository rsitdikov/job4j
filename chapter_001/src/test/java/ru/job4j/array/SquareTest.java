package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertArrayEquals(rst, expect);
    }
    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertArrayEquals(rst, expect);
    }
    @Test
    public void whenBound3Then149162536496481100() {
        int bound = 10;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        assertArrayEquals(rst, expect);
    }
}