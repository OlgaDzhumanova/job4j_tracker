package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int f) {
        return sum(f) + multiply(f) + minus(f) + divide(f);
    }

    public static void main(String[] args) {

        int result = Calculator.sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        int resultMinus = Calculator.minus(3);
        System.out.println(resultMinus);

        System.out.println(calculator.divide(5));

        System.out.println(calculator.sumAllOperation(5));
    }
}
