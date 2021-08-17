package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        doTask1();
    }

    /**
     * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    static void doTask1() {

        Random rand = new Random();
        int a = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте загаданное число от 0 до 9, у вас есть 3 попытки:");
        for (int i = 0; i < 3; i++) {
            int b = scanner.nextInt();
            int attempt = 2 - i;
            String att = "попытки";
            if (attempt == 1) {
                att = "попытка";
            }
            if (b == a) {
                System.out.println("Вы угадали");
                break;
            } else if (b > a) {
                System.out.println("Ваше число больше загаданного, у вас осталось " + attempt + " " + att + ":");
            } else {
                System.out.println("Ваше число меньше загаданного, у вас осталось " + attempt + " " + att + ":");
            }
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int c = scanner.nextInt();
        if (c == 1) {
            doTask1();
        }
    }
}