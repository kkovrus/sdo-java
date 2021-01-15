/*
 * Задание 3,1: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
 */

public class TaskThreeCaseOne {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 7, 6, 6, 7, 8, 9};
        Boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                result = true;
                break;
            }
        }
        System.out.println(result ? "Да" : "Нет");
    }
}
