package com.nurhidayatulf.day5;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    //1. Complete the implementation of the Word Guessing Game by filling in the missing method implementations. Each method should perform a specific task in the game.
    private static final String[] WORDS = {"JAVA", "PROGRAMMING", "DEVELOPER", "COMPUTER", "GITHUB"};
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String wordToGuess = selectRandomWord();
        String hiddenWord = hideWord(wordToGuess);
        int attemptsLeft = 6;

        System.out.println("Welcome to the Word Guessing Game!");

        while (attemptsLeft > 0 && hiddenWord.contains("_")) {
            System.out.println("Current word: " + hiddenWord);
            System.out.println("Attempts left: " + attemptsLeft);

            char guess = getPlayerGuess();

            if (isGuessCorrect(wordToGuess, guess)) {
                hiddenWord = updateHiddenWord(wordToGuess, hiddenWord, guess);
                System.out.println("Good guess!");
            } else {
                attemptsLeft--;
                System.out.println("Wrong guess! Try again.");
            }
        }

        displayGameResult(wordToGuess, hiddenWord, attemptsLeft);
    }

    //select random words from array
    public static String selectRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }

    //create and return a string of underscores
    public static String hideWord(String word) {
        return "_".repeat(word.length());
    }

    //give input to player to guess and return the guessed char
    public static char getPlayerGuess() {
        System.out.print("Enter a letter to guess: ");
        return scanner.nextLine().toUpperCase().charAt(0);
    }

    //check does the guessed character is in the word?
    public static boolean isGuessCorrect(String word, char guess) {
        return word.indexOf(guess) >= 0;
    }

    //update the hidden word by revealing the correct guessed character
    public static String updateHiddenWord(String word, String hiddenWord, char guess) {
        StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                updatedHiddenWord.setCharAt(i, guess);
            }
        }

        return updatedHiddenWord.toString();
    }

    //showing final game result
    public static void displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft) {
        if (hiddenWord.equals(wordToGuess)) {
            System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game over! The word was: " + wordToGuess);
            System.out.println("You had " + attemptsLeft + " attempts left.");
        }
    }
}
