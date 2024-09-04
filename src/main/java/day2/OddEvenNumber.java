package day2;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        //3. Write a function that takes an integer n as input and returns true if n is odd and false if n is even
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " isEven = true");
        else
            System.out.println(num + " isEven = false");
    }
}
