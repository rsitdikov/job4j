package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    List<Student> students = List.of(
            new Student("Ivanov", 100),
            new Student("Petrov", 22),
            new Student("Sidorov", 43),
            new Student("Sergeev", 54),
            new Student("Makarov", 65),
            new Student("Vasil'ev", 36),
            new Student("Savel'ev", 87)
    );

    @Test
    public void whenScoreLess50ThenClassC() {
        Predicate<Student> predicate = student -> student.getScore() < 50;
        List<Student> expected = List.of(
                new Student("Petrov", 22),
                new Student("Sidorov", 43),
                new Student("Vasil'ev", 36)
        );
        List<Student> result = new School().collect(students, predicate);
        assertThat(result, is(expected));
    }
    @Test
    public void whenScoreGreaterOrEqual50AndLess70ThenClassB() {
        Predicate<Student> predicate = student -> student.getScore() >= 50 && student.getScore() < 70;
        List<Student> expected = List.of(
                new Student("Sergeev", 54),
                new Student("Makarov", 65)
        );
        List<Student> result = new School().collect(students, predicate);
        assertThat(result, is(expected));
    }
    @Test
    public void whenScoreGreaterOrEqual70AndLessOrEqual100ThenClassA() {
        Predicate<Student> predicate = student -> student.getScore() >= 70 && student.getScore() <= 100;
        List<Student> expected = List.of(
                new Student("Ivanov", 100),
                new Student("Savel'ev", 87)
        );
        List<Student> result = new School().collect(students, predicate);
        assertThat(result, is(expected));
    }
    @Test
    public void whenConvertListThenResultMap() {
        Map<String, Student> expected = Map.of(
                "Ivanov", new Student("Ivanov", 100),
                "Petrov", new Student("Petrov", 22),
                "Sidorov", new Student("Sidorov", 43),
                "Sergeev", new Student("Sergeev", 54),
                "Makarov", new Student("Makarov", 65),
                "Vasil'ev", new Student("Vasil'ev", 36),
                "Savel'ev", new Student("Savel'ev", 87)
        );
        Map<String, Student> result = new School().convertListToMap(students);
        assertThat(result, is(expected));
    }
}
