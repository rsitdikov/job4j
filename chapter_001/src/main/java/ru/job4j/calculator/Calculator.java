package ru.job4j.calculator;

/**
 * Calculate.
 * @author Ramil Sitdikov
 */

public class Calculator {

    /**
     * Method add
     * @param first - augend
     * @param second - addend
     */

    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * Method div
     * @param first - divisible
     * @param second - divisor
     */

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    /**
     * Method multiply
     * @param first - multiplier
     * @param second - multiplicand
     */

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    /**
     * Method subtract
     * @param first - minuend
     * @param second - subtrahend
     */

    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + " = " + result);
    }
    /**
     * Method main
     * @param args - args
     */

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
