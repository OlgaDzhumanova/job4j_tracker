package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        int total = 0;
        for (int i : number) {
                int finalNum = total;
                total = add(
                        () -> finalNum + i
                );
            }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}