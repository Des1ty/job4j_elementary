package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];
        System.out.println("Размер массива ages = " + ages.length + " " + Arrays.hashCode(ages) + " " + ages.getClass());
        System.out.println("Размер массива surnames = " + surnames.length + " " + Arrays.hashCode(surnames) + " " + surnames.getClass());
        System.out.println("Размер массива prices = " + prices.length + " " + Arrays.hashCode(prices) + " " + prices.getClass());
        names[0] = "Alex";
        names[1] = "John";
        names[2] = "Jax";
        names[3] = "Sony";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
