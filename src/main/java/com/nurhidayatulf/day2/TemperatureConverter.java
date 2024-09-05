package com.nurhidayatulf.day2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        //1. Write a program that takes a temperature in Fahrenheit as input and converts it to Celsius
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit = " + celsius + " degree Celsius");
    }
}
