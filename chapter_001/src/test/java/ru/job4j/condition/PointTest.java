package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int in1 = -6, in2 = 0, in3 = 0, in4 = 8;
        double expected = 10.0;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.1);
    }
}
