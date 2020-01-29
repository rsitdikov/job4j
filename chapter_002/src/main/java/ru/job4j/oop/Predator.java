package ru.job4j.oop;

public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("Class name: Predator");
    }
    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
