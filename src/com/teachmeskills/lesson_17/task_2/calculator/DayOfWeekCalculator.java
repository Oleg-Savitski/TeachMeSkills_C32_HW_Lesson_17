package com.teachmeskills.lesson_17.task_2.calculator;

import com.teachmeskills.lesson_17.task_2.utils.DateUtils;

import java.util.Scanner;

public class DayOfWeekCalculator {

    public void calculateDayOfWeek() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the date in the format YYYY-MM-DD:");

            String inputDate = scanner.nextLine();
            String[] dateParts = inputDate.split("-");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);

            String dayOfWeek = DateUtils.getDayOfWeek(year, month, day);
            System.out.println("\n" +
                    "Day of the week for the date " + inputDate + " - " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Error: Invalid date format. Please use the YYYY-MM-DD format.");
        }
    }
}
