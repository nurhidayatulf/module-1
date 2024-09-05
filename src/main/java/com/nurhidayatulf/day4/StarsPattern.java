package com.nurhidayatulf.day4;

import java.util.Scanner;

public class StarsPattern {
    public static void main(String[] args) {
        //2. Write a program to print the following pattern for n rows
        System.out.println("Input number of stars row to be print: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
