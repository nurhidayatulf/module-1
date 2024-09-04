package day3;

public class LargestElementInArray {
    public static void main(String[] args) {
        //3. Write a program to find the largest element in an array.
        int[] arrayNumber = new int[] {3, 7, 2, 8, 1};
        int max = arrayNumber[0];

        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > max) {
                max = arrayNumber[i];
            }
        }
        System.out.println("Largest element in the array is " + max);
    }
}
