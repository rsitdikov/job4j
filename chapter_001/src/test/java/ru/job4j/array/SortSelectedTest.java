package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort3() {
        int[] input = new int[] {50, -125, 200};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-125, 50, 200};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort5() {
        int[] input = new int[] {-100, -150, 150, 50, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-150, -100, 0, 50, 150};
        assertThat(result, is(expect));
    }
}