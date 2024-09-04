package day3;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        //6. Create a program to generate the Fibonacci sequence up to n terms.
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input n terms you want (number) : ");
        int n = inputScanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNumber + " ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

        }
    }
}
