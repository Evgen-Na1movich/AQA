package lesson2;

import static lesson2.Tasks.*;

public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(isSumInRange(5, 7)); // true
        System.out.println(isSumInRange(-5, 6)); // false

        printPositiveOrNegative(10); // Положительное число
        printPositiveOrNegative(-5); // Отрицательное число
        printPositiveOrNegative(0);

        System.out.println(isPositiveOrNegative(-5));  // true
        System.out.println(isPositiveOrNegative(0));    // false
        System.out.println(isPositiveOrNegative(10));   // false

        printString("Smile", 3);

    }
}

