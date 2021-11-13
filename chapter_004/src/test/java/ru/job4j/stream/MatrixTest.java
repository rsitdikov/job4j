package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class MatrixTest {
    @Test
    public void whenConvertMatrixThenResultList() {
        Integer[][] value = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };
        List<Integer> expected = List.of(2, 4, 6, 8, 10, 12, 14, 16, 18);
        assertEquals(new Matrix().convertToList(value), expected);
    }
}