package com.nurhidayatulf.day5;

import java.util.ArrayList;

public class RemoveOddNumbers {
    public static void main(String[] args) {
        //3. Write a function to remove all odd numbers in an array and return a new array that contains even numbers only
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = removeOddNumbers(numbers);

        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
    }

    public static int[] removeOddNumbers(int[] arrayNumber) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int evenNumber : arrayNumber) {
            if (evenNumber % 2 == 0) {
                evenNumbers.add(evenNumber);
            }
        }

        int[] result = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            result[i] = evenNumbers.get(i);
        }

        return result;
    }
}
