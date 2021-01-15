/*
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * int[] m = new int[2];
 * m[8] = 5;
 */

public class TaskSixCaseEight {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
