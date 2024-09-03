package day1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExerciseDay1 {
    public static void main(String[] args) {
        //Find area of rectangle
        int length = 5;
        int width = 3;
        int area = length * width;

        System.out.println(area);

        //Find diameter, circumference and area of a circle
        int radius = 5;
        float phi = 3.1415F;
        int diameterOfCircle = 2 * radius;
        float circumferenceOfCircle = phi * 2 * radius;
        float areaOfCircle = phi * radius * radius;

        System.out.println("Diameter = " + diameterOfCircle);
        System.out.println("Circumference = " + circumferenceOfCircle);
        System.out.println("Area = " + areaOfCircle);

        //Find angles of triangle if two angles are given
        int a = 80;
        int b = 65;
        int c = 180 - (a + b);

        System.out.println(c);

        //Get difference between dates in days
        String firstDate = "2024-03-19";
        String secondDate = "2024-03-21";

        LocalDate date1 = LocalDate.parse(firstDate.formatted());
        LocalDate date2 = LocalDate.parse(secondDate.formatted());

        long daysBetween = ChronoUnit.DAYS.between(date1,date2);

        System.out.println(daysBetween);

        //Print your name initial in uppercase
        String myName = "Nur Hidayatul Fatihah";

        // Split the name into parts
        String[] myNameParts = myName.split(" ");

        // Initialize a StringBuilder to hold the initials
        StringBuilder initials = new StringBuilder();

        // Loop through each part of the name and get the first letter
        for (String part : myNameParts) {
            initials.append(part.charAt(0));
        }

        // Print the initials in uppercase
        System.out.println(initials.toString().toUpperCase());
    }
}
