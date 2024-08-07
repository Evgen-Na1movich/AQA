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
        int value = random.nextInt(401) - 200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if ( value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("*****task4*****");
        Random random = new Random();
        int a = random.nextInt(201) - 100;
        int b = random.nextInt(201) - 100;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else System.out.println("a < b");
    }

    public static boolean isSumInRange(int a, int b) {
        System.out.println("*****task5*****");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int number) {
        System.out.println("*****task6*****");
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isPositiveOrNegative(int number){
        System.out.println("*****task7*****");
        return number < 0;
    }

    public static void printString(String msg, int count){
        System.out.println("*****task8*****");
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

    public static boolean isLeapYear(int year) {
        System.out.println("*****task9*****");
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
