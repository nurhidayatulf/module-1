package com.nurhidayatulf.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayInAscDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter sorting direction ('asc' for ascending, 'desc' for descending): ");
        String direction = scanner.next();

        sortArray(array, direction);

        scanner.close();
    }

    public static void sortArray(int[] arr, String direction) {
        if (direction.equalsIgnoreCase("asc")) {
            Arrays.sort(arr);
        } else if (direction.equalsIgnoreCase("desc")) {
            Integer[] arrayInInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(arrayInInteger, Collections.reverseOrder());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arrayInInteger[i];
            }
        } else {
            System.out.println("Invalid sorting direction! Use 'asc' or 'desc'.");
            return;
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
