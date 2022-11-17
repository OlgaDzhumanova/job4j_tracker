package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Ответ на ваш вопрос: " + question + " да");
        } else if (answer == 1) {
            System.out.println("Ответ на ваш вопрос: " + question + " нет");
        } else {
            System.out.println("Ответ на ваш вопрос: " + question + " может быть");
        }
    }
}
