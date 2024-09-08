package com.nurhidayatulf.day5;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //4. Create a function that can loop the number of times according to the input we provide, and will replace multiples of 3 with "Fizz", multiples of 5 with "Buzz", multiples of 3 and 5 with "FizzBuzz".
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputNumber = inputScanner.nextInt();

        fizzBuzz(inputNumber);
    }

    public static void fizzBuzz (int inputNumber) {
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
