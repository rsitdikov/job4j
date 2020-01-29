package ru.job4j.oop;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("Class name: Tiger");
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Class name: Tiger");
        System.out.println("The name of the tiger: " + this.name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger");
    }
}
