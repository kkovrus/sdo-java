/*
 * Задача №80 (Повышенная сложность)
 * 1. Создай массив чисел.
 * 2. Добавь в массив 10 чисел с клавиатуры.
 * 3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 *
 * Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
 * Результат: 3
 */

import java.util.Scanner;

// TODO: Не работает
public class TaskEighty {
    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание №80: Введите 10 чисел с клавиатуры для определения самой длинной последовательности повторяющихся чисел: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < 9; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                while (arr[i] == arr[i + 1]) {
                    count++;
                    i++;
                }
                if (max == 0) {
                    max = count;
                } else {
                    max = (max > count) ? max : count;
                }
                count = 0;
            }
        }
        System.out.println("Задание №80: Длина самой длинной последовательности повторяющихся чисел в списке = " + max);
    }
}
