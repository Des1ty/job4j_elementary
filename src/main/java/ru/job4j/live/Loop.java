package ru.job4j.live;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " this " + nameNumber(i) +  " number/s");
        }
    }

    public static String nameNumber(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            default -> "";
        };
    }
}
