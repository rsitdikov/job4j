package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0){
            amount += amount * percent / 100 - salary;
            year ++;
        }
        return year;
    }
}