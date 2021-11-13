package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;


public class GroupTest {

    @Test
    public void whenGroupingIsDone() {
        var input = List.of(
               new Student("Ivanov", Set.of("judo", "chess", "atletics")),
                new Student("Petrov", Set.of("chess", "hockey")),
                new Student("Sidorov", Set.of("hockey", "judo"))
        );

        var result = Group.sections(input);

        assertEquals(result.keySet(), Set.of("atletics", "chess", "hockey", "judo"));
        assertEquals(result.get("atletics"), Set.of("Ivanov"));
        assertEquals(result.get("chess"), Set.of("Ivanov", "Petrov"));
        assertEquals(result.get("hockey"), Set.of("Petrov", "Sidorov"));
        assertEquals(result.get("judo"), Set.of("Ivanov", "Sidorov"));
    }
}