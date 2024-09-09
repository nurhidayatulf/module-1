package com.nurhidayatulf.day6;

import java.util.Arrays;
import java.util.HashSet;

public class CheckDuplicatesArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Example 1: " + containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Example 2: " + containsDuplicate(nums2));

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Example 3: " + containsDuplicate(nums3));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int num : nums) {
            if (!uniqueElements.add(num)) {
                return true;
            }
        }

        return false;
    }
}
