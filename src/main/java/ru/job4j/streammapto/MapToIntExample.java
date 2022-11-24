package ru.job4j.streammapto;

import java.util.*;

public class MapToIntExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5", "6");
        strings.stream()
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum = people.stream()
                .filter(e -> e.getAge() > 25)
                .mapToInt(Person::getAge)
                .peek(System.out::println)
                .sum();
        System.out.println("Сумма: " + sum);

        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));
        int age = youngestPerson.get().getAge();
        System.out.println(age);

        Optional<Person> youngestPersonOther = people.stream()
                .max(Comparator.comparing(Person::getAge));
        int ageOther = youngestPersonOther.get().getAge();
        System.out.println(ageOther);

        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();
        double avg = average.getAsDouble();
        System.out.println("среднее арифметическое всех элементов: " + avg);

        int sumOther = people.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(sumOther);
    }
}