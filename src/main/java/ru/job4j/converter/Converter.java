package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140, expected = 2, out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        expected = 1;
        out = rubleToDollar(in);
        passed  =  expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(150);
        System.out.println("150 dollar are " + dollar + " dollar.");
    }
}
