package lesson2;

import java.util.Random;

public class Tasks {
    public static void printThreeWords() {
        System.out.println("*****task1*****");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.println("*****task2*****");
        Random random = new Random();
        int a = random.nextInt(201) - 100;
        int b = random.nextInt(201) - 100;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        System.out.println("*****task3*****");
        Random random = new Random();
        int value = random.nextInt(1001) - 500;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
