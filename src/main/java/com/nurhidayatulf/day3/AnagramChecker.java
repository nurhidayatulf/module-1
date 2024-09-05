package com.nurhidayatulf.day3;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        //9. Create a function to check if two strings are anagrams.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Input second word: ");
        String secondWord = scanner.nextLine();

        if (areAnagrams(firstWord, secondWord)) {
            System.out.println(firstWord + " and " + secondWord + " are anagrams.");
        } else {
            System.out.println(firstWord + " and " + secondWord + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String firstWord, String secondWord) {
        // Remove spaces and convert strings to lowercase
        firstWord = firstWord.replaceAll("\\s", "").toLowerCase();
        secondWord = secondWord.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are the same
        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = firstWord.toCharArray();
        char[] charArray2 = secondWord.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
