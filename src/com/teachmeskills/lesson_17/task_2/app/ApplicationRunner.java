package com.teachmeskills.lesson_17.task_2.app;

import com.teachmeskills.lesson_17.task_2.calculator.DayOfWeekCalculator;

/** Get the day of the week by date.
 * I used Zeller's algorithm.
 * My curiosity made me use this algorithm.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        DayOfWeekCalculator calculator = new DayOfWeekCalculator();
        calculator.calculateDayOfWeek();
    }
}