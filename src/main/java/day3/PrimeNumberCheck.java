package day3;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        //2. Create a function to check if a number is prime.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number to prime check: ");
        int inputNumber = scanner.nextInt();

        if (isPrime(inputNumber)) {
            System.out.println(inputNumber + " is a prime number");
        } else {
            System.out.println(inputNumber + " is not a prime number");
        }
    }

    public static boolean isPrime (int inputNumber) {
        if (inputNumber <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
