/*
 * Задание 2.5: Пользователь вводит сумму вклада и процент,
 * который будет начисляться ежегодно.
 * Отобразить размер вклада поочередно на ближайшие 5 лет.
 */

import java.util.Scanner;

public class TaskTwoCaseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада...");
        double depositAmount = scanner.nextDouble();
        System.out.println("Введите процент вклада...");
        int depositPercentage = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < 6; i++) {
            depositAmount += depositAmount * depositPercentage / 100;
            System.out.printf("Размер вклада за " + i + " год = %.2f\n", depositAmount);
        }
    }
}
