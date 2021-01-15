/*
 * Задача 2.1
 * Дан массив из 10 целых чисел, необходимо найти среднее арифметическое значение чисел этого массива.
 */

public class TaskTwoCaseOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        int result = sum / arr.length;
        System.out.println("Задание 2.1: Среднее арифметическое значение 10 чисел массива = " + result);
    }
}
