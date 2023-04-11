package ru.job4j.calculator;

public class Out {
    public static void main(String[] args) {
        String lyrics = "Мама мыла раму";
        System.out.println(lyrics);
        byte age = 33;
        String name = "Petr", surname = "Arsentev", separator = " ",
                id = name + separator + surname + separator + "years old " + age;
        System.out.println(id);
    }
}
