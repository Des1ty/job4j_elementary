package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        for (short age : ages) {
            ages[age] = 0;
        }
        for (short defer : ages) {
            System.out.println(defer);
        }
    }
}
