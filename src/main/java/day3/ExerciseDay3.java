package day3;

import java.util.Scanner;

public class ExerciseDay3 {
    public static void main(String[] args) {
        //1. Write a program to calculate the sum of digits in a given number.
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input numbers: ");

        int inputNumber = inputScanner.nextInt();
        System.out.println("Sum of " + inputNumber + " is " + SumOfDigits(inputNumber));

    }

    public static int SumOfDigits(int inputNumber) {
        int sum = 0;
        int remainder = 0;

        while (inputNumber != 0) {
            remainder = inputNumber % 10;
            sum = sum + remainder;
            inputNumber = inputNumber / 10;
        }

        return sum;
    }
}
