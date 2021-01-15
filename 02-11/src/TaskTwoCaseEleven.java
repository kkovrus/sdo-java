/*
 * Задание 2,11: В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 */

public class TaskTwoCaseEleven {
    public static void main(String[] args) {
        int min = 44;
        int fourth = (int) 59 / 4;
        if (min <= fourth) {
            System.out.println("Число попадает в первую четверть");
        } else if (min <= fourth * 2 + 1) {
            System.out.println("Число попадает в вторую четверть");
        } else if (min <= fourth * 3 + 2) {
            System.out.println("Число попадает в третью четверть");
        } else {
            System.out.println("Число попадает в четвертую четверть");
        }
    }
}
