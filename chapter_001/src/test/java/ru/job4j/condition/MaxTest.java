package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max a = new Max();
        assertEquals(a.max(1, 2), 2);
    }
    @Test
    public void whenMax2To1Then2() {
        Max a = new Max();
        assertEquals(a.max(2, 1), 2);
    }
    @Test
    public void whenMax2To2Then2() {
        Max a = new Max();
        assertEquals(a.max(2, 2), 2);
    }
    @Test
    public void whenMax3To2To1Then3() {
        Max a = new Max();
        assertEquals(a.max(3, 2, 1), 3);
    }
    @Test
    public void whenMax4To2To3To1Then4() {
        Max a = new Max();
        assertEquals(a.max(4, 2, 3, 1), 4);
    }
}
