/*
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
 * 2. String date передается в формате FEBRUARY 1 2013
 * Не забудьте учесть первый день года.
 *
 * Пример:
 * JANUARY 1 2000 = true
 * JANUARY 2 2020 = false
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TaskSevenCaseOne {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(simpleDateFormat.parse(date));
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
