/*
 * Задача 4.1
 * Написать функцию, которая возвращает минимум из двух чисел.
 */

public class TaskFourCaseOne {
    public static void main(String[] args) {
        System.out.println(min(4, 4));
    }

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}
