package ru.job4j.collection;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = List.of(
                new int[] {1},
                new int[] {2, 3}
        );
        List<Integer> expect = List.of(1, 2, 3);
        assertEquals(ConvertList.convert(in), expect);
    }
}
