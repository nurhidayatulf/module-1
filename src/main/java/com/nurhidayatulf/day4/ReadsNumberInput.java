package com.nurhidayatulf.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadsNumberInput {
    public static void main(String[] args) {
        //3. Write a code that reads n number of input from scanner
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersInput = new ArrayList<>();

        String choice = "";
        do {
            System.out.print("Input a random number: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                numbersInput.add(number);

            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + input);
                continue;
            }

            while (true) {
                System.out.print("Press 'y' to continue or 'n' to stop: ");
                choice = scanner.next();

                if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'y' or 'n'.");
                }
            }

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Numbers entered: " + numbersInput);
        scanner.close();
    }
}
