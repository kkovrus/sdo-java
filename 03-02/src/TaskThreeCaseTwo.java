/*
 * Задание 3,2: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
 */

public class TaskThreeCaseTwo {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 9, 5, 7, 3, 9};
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = true;
                break;
            }
        }
        System.out.println(result ? "Да" : "Нет");
    }
}
