package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private final String name;
    private final int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    @Override
    public String toString() {
        return "Student{name='"
                + name + "'"
                + ", score="
                + score + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return getScore() == student.getScore() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScore());
    }
}
