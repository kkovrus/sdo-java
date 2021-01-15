/*
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * String s = null;
 * String m = s.toLowerCase();
 */

public class TaskSixCaseSeven {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }
}
