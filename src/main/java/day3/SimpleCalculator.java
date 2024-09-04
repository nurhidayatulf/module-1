package day3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //4. Implement a simple calculator that can perform addition, subtraction, multiplication, and division.
        int operator, firstNumber, secondNumber;

        System.out.println("1 - Add \n 2 - Substract \n 3 - Multiply \n 4 - Divide");
        System.out.println("Choose the Operator: ");
        Scanner inputScanner3 = new Scanner(System.in);
        operator = inputScanner3.nextInt();

        System.out.println("Enter the first number : ");
        firstNumber = inputScanner3.nextInt();

        System.out.println("Enter the second number : ");
        secondNumber = inputScanner3.nextInt();

        int result = 0;
        switch (operator) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber / secondNumber;
                break;

            default:
                System.out.println("Entered operator is invalid");
        }
        System.out.println("Result : " + result);
    }
}
