/*
 * Задача 4.2
 * Написать функцию, которая возвращает минимум из трёх чисел.
 */

public class TaskFourCaseTwo {
    public static void main(String[] args) {
        System.out.println(min(8, 7, 8));
    }

    static int min(int a, int b, int c) {
        int min = (a < b) ? a : b;
        min = (a < min) ? a : min;
        return min;
    }
}
