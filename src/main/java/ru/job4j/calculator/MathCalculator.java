package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    public static double sumAll(double first, double second) {
        return sumAndMultiply(first, second) + minusAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы сложения и умножения, равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления, равен: " + minusAndDivide(10, 20));
        System.out.println("Результат расчета всех функций равен: " + sumAll(10, 20));
    }
}
