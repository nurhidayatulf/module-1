package com.nurhidayatulf.day4;

import java.util.Scanner;

public class SwapCharacterCase {
    public static void main(String[] args) {
        //5. Write a code to swap the case of each character from string
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word or text in any case: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c)); // Convert to uppercase
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c)); // Convert to lowercase
            } else {
                result.append(c); // Non-alphabetic characters remain the same
            }
        }

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
