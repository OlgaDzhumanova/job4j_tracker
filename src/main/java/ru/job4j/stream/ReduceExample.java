package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        Optional<Integer> sum = nums.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum.get());

        List<String> words = List.of("Один", "Два", "Три");
        Optional<String> word = words.stream()
                .reduce((a, b) -> a + ", " + b);
        System.out.println(word.get());

        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4);
        int sum1 = nums1.stream()
                .reduce(2, (a, b) -> a + b);
        System.out.println(sum1);
    }
}