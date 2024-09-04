package day3;

public class SecondSmallestNumberInArray {
    public static void main(String[] args) {
        //10. Write a program to find the second smallest element in an array.
        int[] array = {5, 3, 8, 1, 2, 9};

        try {
            int secondSmallest = findSecondSmallest(array);
            System.out.println("The second smallest element is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("There is no second smallest element in the array.");
        }

        return secondSmallest;
    }
}
