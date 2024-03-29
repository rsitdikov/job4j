package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertArrayEquals(result, expect);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(result, expect);
    }
}
