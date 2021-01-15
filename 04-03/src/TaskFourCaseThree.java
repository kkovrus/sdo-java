/*
 * Задача 4.3
 * Написать функцию, которая возвращает минимум из четырёх чисел.
 * Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 * (которую вы разработали в задаче 4.1).
 */

public class TaskFourCaseThree {
    public static void main(String[] args) {
        System.out.println(min(3, 2, 3, 4));
    }

    static int min(int a, int b, int c, int d) {
        return (min(a, b) < min(c, d)) ? min(a, b) : min(c, d);
    }

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}
