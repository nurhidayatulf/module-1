package com.nurhidayatulf.day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] example1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] example2 = {1, 1, 2};
        int[] example3 = {1};

        System.out.println("Duplicates in example1: " + findDuplicates(example1));
        System.out.println("Duplicates in example2: " + findDuplicates(example2));
        System.out.println("Duplicates in example3: " + findDuplicates(example3));
    }

    public static List<Integer> findDuplicates(int[] arrayExample) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int element : arrayExample) {
            if (!seen.add(element)) {
                duplicates.add(element);
            }
        }

        return new ArrayList<>(duplicates);
    }
}
