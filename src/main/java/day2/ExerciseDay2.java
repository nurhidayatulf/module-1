package day2;

import java.util.Scanner;

public class ExerciseDay2 {
    public static void main(String[] args) {
        //1. Write a program that takes a temperature in Fahrenheit as input and converts it to Celsius
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit = " + celsius + " degree Celsius");

        //2.Write a code to convert centimeter to kilometer
        final double kilometer = 0.00001;

        Scanner in = new Scanner(System.in);

        System.out.print("Input length in centimeters : ");
        double cm = in.nextDouble();
        double km = cm * kilometer;
        System.out.println(cm + " cm = " + km + " km.");

        //3. Write a function that takes an integer n as input and returns true if n is odd and false if n is even
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

        //4. Write a code to remove the first occurrence of a given “search string” from a string
        String originalString = "Hello world";
        String searchString = "ell";

        String resultString = removeFirstOccurrence(originalString, searchString);

        System.out.println("Original String: " + originalString);
        System.out.println("Search String: " + searchString);
        System.out.println("Result String: " + resultString);

        //5. Write a code to check whether a string is a palindrome or not.
        String value = "madam";
        if (isPalindrome(value)) {
            System.out.println(value + " → palindrome");
        } else {
            System.out.println(value + " → not a palindrome");
        }
    }

    public static String removeFirstOccurrence(String original, String search) {
        int index = original.toLowerCase().indexOf(search.toLowerCase());

        if (index != -1) {
            return original.substring(0, index) + original.substring(index + search.length());
        }

        return original;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.contentEquals(reversed);
    }
}
