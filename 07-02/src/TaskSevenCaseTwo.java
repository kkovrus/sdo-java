/*
 * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
 * Используйте коллекции.
 * (Придётся погуглить коллекции)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TaskSevenCaseTwo {

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя месяца...");
        String name = scanner.readLine();
        scanner.close();
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June ", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October ", 10);
        map.put("November", 11);
        map.put("December", 12);

        System.out.println((map.get(name) != null) ? name + " is the " + map.get(name) + " month " : "Введен некоректный месяц");
    }
}
