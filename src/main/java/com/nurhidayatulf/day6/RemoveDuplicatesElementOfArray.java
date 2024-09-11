package com.nurhidayatulf.day6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 5};

        int[] newRemovedArray = removeDuplicates(array);

        // Printing the array without duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(newRemovedArray));
    }

    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int element : arr) {
            set.add(element);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int element : set) {
            result[i++] = element;
        }

        return result;
    }
}
