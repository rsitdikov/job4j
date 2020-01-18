package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas1Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 1;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas10Then9() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 9;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayNotHas11() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 11;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind2() {
        int[] input = new int[] {15, 25, 10, 20, 45};
        int value = 10;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenNoFind() {
        int[] input = new int[] {15, 25, 10, 20, 45};
        int value = 10;
        int start = 3;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}

