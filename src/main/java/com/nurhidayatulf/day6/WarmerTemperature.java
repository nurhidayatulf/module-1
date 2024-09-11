package com.nurhidayatulf.day6;

import java.util.Stack;

public class WarmerTemperature {
    public static void main(String[] args) {
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result1 = dailyTemperatures(temperatures1);
        System.out.println("Output for temperatures1: " + java.util.Arrays.toString(result1));

        int[] temperatures2 = {30, 40, 50, 60};
        int[] result2 = dailyTemperatures(temperatures2);
        System.out.println("Output for temperatures2: " + java.util.Arrays.toString(result2));

        int[] temperatures3 = {30, 60, 90};
        int[] result3 = dailyTemperatures(temperatures3);
        System.out.println("Output for temperatures3: " + java.util.Arrays.toString(result3));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int temperatureArray = temperatures.length;
        int[] result = new int[temperatureArray];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatureArray; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }
}
