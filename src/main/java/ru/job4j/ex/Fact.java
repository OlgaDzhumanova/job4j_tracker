package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        new Fact().calc(1);

    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("неверно введеный параметр, отрицательное число");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}