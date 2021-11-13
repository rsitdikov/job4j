package ru.job4j.loop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int st = 1;
        int fn = 10;
        int expected = 30;
        int sm = Counter.add(st, fn);
        assertEquals(sm, expected);
    }
}
