package com.nurhidayatulf.day6;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String stringInput = scanner.nextLine();

        String reversedString = reverse(stringInput);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    public static String reverse(String string) {
        String reversed = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }

        return reversed;
    }
}
