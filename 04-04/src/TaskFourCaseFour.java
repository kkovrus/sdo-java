/*
 * Задача 4.4
 * Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
 * -----
 * Подсказка: их 6 штук.
 * Каждую комбинацию вывести с новой строки. Слова не разделять.
 * ----------
 * Пример:
 * МылаРамуМама
 * РамуМамаМыла
 * ...
 */

public class TaskFourCaseFour {
    public static void main(String[] args) {
        String[] strings = {"Мама", "Мыла", "Раму"};
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                for (int k = 0; k < strings.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.print(strings[i] + strings[j] + strings[k]);
                        System.out.println();
                    }
                }
            }
        }
    }
}
