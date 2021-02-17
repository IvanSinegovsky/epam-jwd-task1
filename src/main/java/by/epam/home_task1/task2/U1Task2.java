package by.epam.home_task1.task2;

import java.time.YearMonth;
import java.util.GregorianCalendar;

public class U1Task2 {
    public static void main(String[] args) {
        int yearNumber = 2024;
        int monthNumber = 2;

        System.out.println(yearNumber + " is leap year - " + isLeapYear(yearNumber));
        System.out.println("Days in " + yearNumber + "/" + monthNumber + " - "
                + daysInMonthQuantity(yearNumber, monthNumber));
    }

    public static boolean isLeapYear(int yearNumber) {
        return new GregorianCalendar().isLeapYear(yearNumber);
    }

    public static int daysInMonthQuantity(int yearNumber, int monthNumber) {
        YearMonth yearMonth = YearMonth.of(yearNumber, monthNumber);
        return yearMonth.lengthOfMonth();
    }
}
