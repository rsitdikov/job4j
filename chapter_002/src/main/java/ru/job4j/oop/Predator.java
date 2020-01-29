package ru.job4j.oop;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Class name: Predator");
    }

    public Predator(String name) {
        super(name);
        System.out.println("Class name: Predator");
        System.out.println("The name of the predator: " + this.name);
    }
    public static void main(String[] args) {
        Predator predator = new Predator("Predator");
    }
}
