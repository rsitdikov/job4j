package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point first = new Point(0, 3);
        Point second = new Point(4, 0);
        double expected = 5.0;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.1);
    }
}
