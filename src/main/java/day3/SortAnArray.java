package day3;

public class SortAnArray {
    public static void main(String[] args) {
        //8. Implement a program to sort an array of integers using bubble sort.
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Unsorted Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    int temporary = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temporary;
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
