package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        boolean rsl = strings
                .stream()
                .noneMatch("Шесть"::contains);
        System.out.println("ни один из элементов потока не удовлетворяет условию: " + rsl);

        boolean rsl1 = strings
                .stream()
                .anyMatch(e -> e.endsWith("ь"));
        System.out.println("как минимум один из элементов потока удовлетворяет условию: " + rsl1);

        List<String> strings2 = Arrays.asList("Трижды", "Три", "Триста", "Три тысячи");
        boolean rsl2 = strings2
                .stream()
                .allMatch(e -> e.startsWith("Три"));
        System.out.println("все элементы потока удовлетворяют условию: " + rsl2);
    }
}