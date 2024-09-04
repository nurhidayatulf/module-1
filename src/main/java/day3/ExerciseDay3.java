package day3;

import java.util.Scanner;

public class ExerciseDay3 {
    public static void main(String[] args) {
        //1. Write a program to calculate the sum of digits in a given number.
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input number to sum the digits: ");
        int inputNumber = inputScanner.nextInt();

        System.out.println("Sum of " + inputNumber + " is " + SumOfDigits(inputNumber));

        //2. Create a function to check if a number is prime.
        Scanner inputScanner2 = new Scanner(System.in);
        System.out.print("Input number to prime check: ");
        int inputNumber2 = inputScanner2.nextInt();

        if (isPrime(inputNumber2)) {
            System.out.println(inputNumber2 + " is a prime number");
        } else {
            System.out.println(inputNumber2 + " is not a prime number");
        }

        //3. Write a program to find the largest element in an array.
        int[] arrayNumber = new int[] {3, 7, 2, 8, 1};
        int max = arrayNumber[0];

        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > max) {
                max = arrayNumber[i];
            }
        }
        System.out.println("Largest element in the array is " + max);
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

    public static boolean isPrime (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
