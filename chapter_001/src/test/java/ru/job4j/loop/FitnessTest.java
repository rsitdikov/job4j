package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        Fitness fit = new Fitness();
        int month = fit.calc(95, 90);
        assertEquals(month, 0);
    }

    @Test
    public void whenIvanLessByOneNik() {
        Fitness fit = new Fitness();
        int month = fit.calc(90, 95);
        assertEquals(month, 1);
    }

    @Test
    public void whenIvanLessByFewNik() {
        Fitness fit = new Fitness();
        int month = fit.calc(50, 90);
        assertEquals(month, 2);
    }
    @Test
    public void whenIvanLessByFourNik() {
        Fitness fit = new Fitness();
        int month = fit.calc(25, 90);
        assertEquals(month, 4);
    }
}
