/*
 * Задание 2.6: Запросить у пользователя ввод числа
 * и сохранить это число в переменную a.
 * Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
 */

import java.util.Scanner;

public class TaskTwoCaseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в переменную а ...");
        int a = scanner.nextInt();
        scanner.close();
        if (a == 10) {
            System.out.println("Верно");
        } else {
            System.out.println("Неверно");
        }
    }
}
