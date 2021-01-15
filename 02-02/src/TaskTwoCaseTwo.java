/*
 * Задача 2.2
 * Дан массив из 10 целых чисел, необходимо найти максимальное число в этом массиве.
 */

public class TaskTwoCaseTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = arr[0];
        for (int i = 1; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Задание 2.2: Максимальное число в массиве из 10 целых чисел = " + max);
    }
}
