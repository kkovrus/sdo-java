/*
 * Задание 1.8
 * Запросить у пользователя число(температуру в цельсиях) и записать его в переменную.
 * Программа должна переводить температуру и возвращать значение в градусах Фаренгейта.
 * Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
 * TF = (9 / 5) * TC + 32
 * Например: для числа 41 результат будет 105.8
 */

import java.util.Scanner;

public class TaskOneCaseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1.8: Введите температуру в цельсиях для перевода в градусы Фаренгейта: ");
        double TC = scanner.nextInt();
        scanner.close();
        double TF = (9.0 / 5.0) * TC + 32;
        System.out.println("Задание 1.8: Температура в градусах Фаренгейта: " + TF);
    }
}
