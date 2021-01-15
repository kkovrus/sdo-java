/*
 * Задание 1.9
 * Запросить у пользователя 2 числа (сохранить их в разные переменные)
 * вывести на экран максимальное из двух чисел, если числа равны, вывести их сумму.
 */

import java.util.Scanner;

public class TaskOneCaseNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1.9: Введите первое число для определения максимального или суммы: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Задание 1.9: Введите второе число для определения максимального или суммы: ");
        int secondNumber = scanner.nextInt();
        scanner.close();
        if (firstNumber > secondNumber) {
            System.out.println("Задание 1.9: Максимально число: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Задание 1.9: Максимально число: " + secondNumber);
        } else {
            System.out.println("Задание 1.9: Числа равны, их сумма: " + (firstNumber + secondNumber));
        }
    }
}
