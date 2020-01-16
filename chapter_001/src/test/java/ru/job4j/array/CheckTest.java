package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenTheEvenNumberOfArrayElementsMonoCheck() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true, true};
        assertThat(check.mono(input), is(false));
        input = new boolean[]{true, true, true, true};
        assertThat(check.mono(input), is(true));
        input = new boolean[]{false, false, false, false};
        assertThat(check.mono(input), is(true));
    }
    @Test
    public void whenAnOddNumberOfArrayElementsMonoCheck() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true, true, false};
        assertThat(check.mono(input), is(false));
        input = new boolean[]{true, true, true, true, true};
        assertThat(check.mono(input), is(true));
        input = new boolean[]{false, false, false, false, false};
        assertThat(check.mono(input), is(true));
    }
}
