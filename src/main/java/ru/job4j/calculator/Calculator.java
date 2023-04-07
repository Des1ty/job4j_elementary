package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1, two = 2, onePlusTwo = one + two, four = 4, five = 5, six = 6,
                sixDivTwo = six / two, fiveMinusTwo = five - two, fourTimesTwo = four * two, size = 10;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimesTwo);
        System.out.println(size);
        size = 100;
        System.out.println(size);
        size += 5;
        System.out.println(size);
    }
}
