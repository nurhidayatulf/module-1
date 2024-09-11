package com.nurhidayatulf.day6;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveOccurenceInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int keyElement = scanner.nextInt();

        int[] newArray = removeElement(array, keyElement);

        System.out.println("New Array after removing all occurrences of " + keyElement + ": " + Arrays.toString(newArray));

        scanner.close();
    }

    public static int[] removeElement(int[] array, int keyElement) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != keyElement) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != keyElement) {
                result[index++] = array[i];
            }
        }
        return result;
    }
}
