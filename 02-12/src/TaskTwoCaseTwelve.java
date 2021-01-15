/*
 * Задание 2,12: Даны переменные a и b.
 * Проверьте, что a делится без остатка на b.
 * Если это так - выведите 'Делится' и результат деления,
 * иначе выведите 'Делится с остатком' и остаток от деления.
 */

public class TaskTwoCaseTwelve {
    public static void main(String[] args) {
        int a = 11, b = 20;
        if (a % b == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Делится с остатком");
        }
    }
}
