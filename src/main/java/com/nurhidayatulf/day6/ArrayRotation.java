package com.nurhidayatulf.day6;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        System.out.println("Original array: " + Arrays.toString(array));

        rotateArray(array, d);

        System.out.println("Array after rotation: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] array, int d) {
        int n = array.length;

        d = d % n;

        //reverse the first part of the array (from 0 to d-1)
        reverseArray(array, 0, d - 1);
        //reverse the second part of the array (from d to n-1)
        reverseArray(array, d, n - 1);
        //reverse the entire array
        reverseArray(array, 0, n - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temporaryVar = array[start];
            array[start] = array[end];
            array[end] = temporaryVar;
            start++;
            end--;
        }
    }
}
