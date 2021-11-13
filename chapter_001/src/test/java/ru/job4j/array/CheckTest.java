package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckTest {

    @Test
    public void whenTheEvenNumberOfArrayElementsMonoCheck() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true, true};
        assertEquals(check.mono(input), false);
        input = new boolean[]{true, true, true, true};
        assertEquals(check.mono(input), true);
        input = new boolean[]{false, false, false, false};
        assertEquals(check.mono(input), true);
    }
    @Test
    public void whenAnOddNumberOfArrayElementsMonoCheck() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true, true, false};
        assertEquals(check.mono(input), false);
        input = new boolean[]{true, true, true, true, true};
        assertEquals(check.mono(input), true);
        input = new boolean[]{false, false, false, false, false};
        assertEquals(check.mono(input), true);
    }
}
