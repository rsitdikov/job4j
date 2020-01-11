package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100.0) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110.0) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(100);
        System.out.println("Man 100 is " + man);
        double woman = womanWeight(110);
        System.out.println("Woman 110 is " + woman);
        man = manWeight(150);
        System.out.println("Man 150 is " + man);
        woman = womanWeight(150);
        System.out.println("Woman 150 is " + woman);
        man = manWeight(180);
        System.out.println("Man 180 is " + man);
        woman = womanWeight(180);
        System.out.println("Woman 180 is " + woman);

    }
}
