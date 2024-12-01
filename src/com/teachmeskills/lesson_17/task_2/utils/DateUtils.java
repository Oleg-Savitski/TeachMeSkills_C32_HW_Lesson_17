package com.teachmeskills.lesson_17.task_2.utils;

/** I found Zeller's algorithm on the Internet.
 * There are a lot of options for solving this task.
 */
public class DateUtils {

    public static String getDayOfWeek(int year, int month, int day) {

        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int f = day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j);
        int dayOfWeek = (f % 7 + 7) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[dayOfWeek];
    }
}
