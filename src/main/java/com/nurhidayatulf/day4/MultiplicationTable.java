package com.nurhidayatulf.day4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //1. Create a program that prints a multiplication table up to n x n.
        System.out.println("Input number for table up to : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
