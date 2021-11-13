package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MatrixTest {
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertArrayEquals(table, expect);
    }
    @Test
    public void when3on3() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(3);
        int[][] expect = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertArrayEquals(table, expect);
    }
    @Test
    public void when5on5() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(5);
        int[][] expect = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        assertArrayEquals(table, expect);
    }
}
