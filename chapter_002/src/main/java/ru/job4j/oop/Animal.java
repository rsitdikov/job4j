package ru.job4j.oop;

public class Animal {

    String name;

    public Animal() {
        super();
        System.out.println("Class name: Animal");
    }

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("Class name: Animal");
        System.out.println("The name of the animal: " + this.name);
    }
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
    }
}