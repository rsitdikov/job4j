package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortSelectedTest {
    @Test
    public void whenSort3() {
        int[] input = new int[] {50, -125, 200};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-125, 50, 200};
        assertArrayEquals(result, expect);
    }
    @Test
    public void whenSort5() {
        int[] input = new int[] {-100, -150, 150, 50, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-150, -100, 0, 50, 150};
        assertArrayEquals(result, expect);
    }
}