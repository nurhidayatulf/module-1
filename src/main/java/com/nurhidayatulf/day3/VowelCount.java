package com.nurhidayatulf.day3;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        //7. Write a function to count the number of vowels in a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        int vowelCount = countVowels(inputWord);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String inputWord) {
        int count = 0;

        for (int i = 0; i < inputWord.length(); i++) {
            char character = inputWord.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                    character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                count++;
            }
        }
        return count;
    }
}
