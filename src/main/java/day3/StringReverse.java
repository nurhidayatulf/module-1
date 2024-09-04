package day3;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        //5. Write a function to reverse a string without using built-in reverse functions.
        Scanner inputScanner4 = new Scanner(System.in);
        System.out.print("Input word : ");
        String word = inputScanner4.nextLine();

        char[] chars = word.toCharArray();
        String reversedWord = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversedWord += chars[i];
        }
        System.out.println("Reversed word: " + reversedWord);
    }
}
