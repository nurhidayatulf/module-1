package com.nurhidayatulf.day1;

public class Circle {
    public static void main(String[] args) {
        //2. Find diameter, circumference and area of a circle
        int radius = 5;
        float phi = 3.1415F;
        int diameterOfCircle = 2 * radius;
        float circumferenceOfCircle = phi * 2 * radius;
        float areaOfCircle = phi * radius * radius;

        System.out.println("Diameter = " + diameterOfCircle);
        System.out.println("Circumference = " + circumferenceOfCircle);
        System.out.println("Area = " + areaOfCircle);
    }
}
