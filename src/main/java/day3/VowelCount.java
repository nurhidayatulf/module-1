package day3;

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

    public static int countVowels(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
}
