/*
 * Задание 2,10: Назовем «весом числа» сумму его цифр. Напишите код, который принимает от пользователя число и выводит на экран его «вес».
 */

import java.util.Scanner;

public class TaskTwoCaseTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ...");
        int number = scanner.nextInt();
        scanner.close();
        String s = Integer.toString(number);
        char[] chars =  s.toCharArray();
        int numWeight = 0;
        for (int i = 0; i < chars.length; i++) {
            numWeight += Character.getNumericValue(chars[i]);
        }
        System.out.println("Вес числа " + numWeight);
    }
}
