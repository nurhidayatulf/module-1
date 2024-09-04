package day3;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        //2. Create a function to check if a number is prime.
        Scanner inputScanner2 = new Scanner(System.in);
        System.out.print("Input number to prime check: ");
        int inputNumber2 = inputScanner2.nextInt();

        if (isPrime(inputNumber2)) {
            System.out.println(inputNumber2 + " is a prime number");
        } else {
            System.out.println(inputNumber2 + " is not a prime number");
        }
    }

    public static boolean isPrime (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
