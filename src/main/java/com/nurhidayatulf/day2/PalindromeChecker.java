package com.nurhidayatulf.day2;

public class PalindromeChecker {
    public static void main(String[] args) {
        //5. Write a code to check whether a string is a palindrome or not.
        String value = "madam";
        if (isPalindrome(value)) {
            System.out.println(value + " → palindrome");
        } else {
            System.out.println(value + " → not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.contentEquals(reversed);
    }
}
