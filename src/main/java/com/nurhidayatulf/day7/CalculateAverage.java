package com.nurhidayatulf.day7;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumOfNumbers = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (or 'q' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                sumOfNumbers += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }
        }

        if (count > 0) {
            double average = sumOfNumbers / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
