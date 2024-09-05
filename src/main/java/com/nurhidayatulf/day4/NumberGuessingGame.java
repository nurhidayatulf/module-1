package com.nurhidayatulf.day4;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //4. Create a simple number guessing game where the computer generates a random number between 1 and 100, and the user tries to guess it. The program should provide hints like "Too high" or "Too low" after each guess.
        Random randomNumber = new Random();
        int numberToGuess = randomNumber.nextInt(100) + 1;
        int userGuessInput = 0;
        int attempt = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a randomNumber number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Game loop
        while (userGuessInput != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuessInput = scanner.nextInt();
            attempt++;

            // The feedback
            if (userGuessInput < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuessInput > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You've guessed the number.");
            }
        }

        System.out.println("Attempts : " + attempt);

        scanner.close();
    }
}
