package com.nurhidayatulf.day5;

import java.util.HashMap;

public class IndicesOfTwoNumbersAdd {
    public static void main(String[] args) {
        //5. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sumTwoNumbers(nums, target);

        if (result != null) {
            System.out.printf("Indices of the two numbers that add up to %d are: [%d, %d]%n", target, result[0], result[1]);
        } else {
            System.out.println("No pair exists.");
        }
    }

    public static int[] sumTwoNumbers(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
