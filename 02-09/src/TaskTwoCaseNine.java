/*
 * Задание 2,9: Напишите фрагмент кода, который принимает от пользователя число
 * и если число четное то программа выводит на экран число, которое больше введенного с клавиатуры на 10,
 * в противном случае выводит на экран число в 10 раз больше введенного.
 */

import java.util.Scanner;

public class TaskTwoCaseNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число...");
        int result = scanner.nextInt();
        scanner.close();
        if ((result % 2) == 0) {
            System.out.println(result + 10);
        } else {
            System.out.println(result * 10);
        }
    }
}
