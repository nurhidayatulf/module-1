package com.nurhidayatulf.day1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {
    public static void main(String[] args) {
        //4. Get difference between dates in days
        String firstDate = "2024-03-19";
        String secondDate = "2024-03-21";

        LocalDate date1 = LocalDate.parse(firstDate.formatted());
        LocalDate date2 = LocalDate.parse(secondDate.formatted());

        long daysBetween = ChronoUnit.DAYS.between(date1,date2);

        System.out.println(daysBetween);
    }
}
