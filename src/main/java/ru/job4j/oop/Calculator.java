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
        return x - z;
    }

    public int divide(int b) {
        return x / b;
    }

    public int sumAllOperation(int resultSum) {
        return sum(resultSum) + multiply(resultSum) + minus(resultSum) + divide(resultSum);
    }

    public static void main(String[] args) {

        int result = Calculator.sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        int resultMinus = Calculator.minus(3);
        System.out.println(resultMinus);

        Calculator calc = new Calculator();
        System.out.println(calc.divide(5));

        Calculator allOperCalc = new Calculator();
        System.out.println(allOperCalc.sumAllOperation(5));
    }
}
