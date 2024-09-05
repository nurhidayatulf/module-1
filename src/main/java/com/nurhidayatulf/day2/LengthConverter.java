package com.nurhidayatulf.day2;

import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        //2.Write a code to convert centimeter to kilometer
        final double kilometer = 0.00001;

        Scanner in = new Scanner(System.in);

        System.out.print("Input length in centimeters : ");
        double cm = in.nextDouble();
        double km = cm * kilometer;
        System.out.println(cm + " cm = " + km + " km.");
    }
}
