package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 3, 4);
        assertEquals(result, 5);
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertEquals(result, 4);
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(0, -5, 3);
        assertEquals(result, 3);
    }
    @Test
    public void whenEveryoneIsEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 2, 2);
        assertEquals(result, 2);
    }

}
