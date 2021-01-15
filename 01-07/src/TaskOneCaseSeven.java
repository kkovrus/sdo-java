/*
 * Задание 1.7
 * Запросить у пользователя число и записать его в переменную radius.
 * Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
 * Результат - дробное число (тип double).
 * В качестве значения Pi используй значение 3.14.
 */

import java.util.Scanner;

public class TaskOneCaseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1.7: Введите радиус для определения длинны окружности: ");
        double radius = scanner.nextDouble();
        scanner.close();
        double l = 2 * 3.14 * radius;
        System.out.println("Задание 1.7: Длина окружности " + l);
    }
}
