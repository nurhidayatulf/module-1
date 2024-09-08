package com.nurhidayatulf.day5;

import java.util.Scanner;

public class CurrencyConverter {
    //2. Write a program to handle currency conversion with predefined exchange value
    static final double USD_TO_EUR = 0.92;
    static final double USD_TO_GBP = 0.79;
    static final double USD_TO_JPY = 147.65;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the source currency (USD, EUR, GBP, or JPY): ");
        String sourceCurrency = scanner.nextLine();

        System.out.print("Enter the target currency (USD, EUR, GBP, or JPY): ");
        String targetCurrency = scanner.nextLine();

        double result = convertCurrency(amount, sourceCurrency, targetCurrency);

        if (result != -1) {
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, sourceCurrency.toUpperCase(), result, targetCurrency.toUpperCase());
        } else {
            System.out.println("Conversion failed due to unsupported currency.");
        }

        scanner.close();
    }

    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double amountInUSD = 0.0;
        double convertedAmount = 0.0;

        //Convert the source currency to USD
        switch (sourceCurrency.toUpperCase()) {
            case "USD":
                amountInUSD = amount;
                break;
            case "EUR":
                amountInUSD = amount / USD_TO_EUR;
                break;
            case "GBP":
                amountInUSD = amount / USD_TO_GBP;
                break;
            case "JPY":
                amountInUSD = amount / USD_TO_JPY;
                break;
            default:
                System.out.println("Unsupported source currency.");
                return -1;
        }

        //Convert from USD to the target currency
        switch (targetCurrency.toUpperCase()) {
            case "USD":
                convertedAmount = amountInUSD;
                break;
            case "EUR":
                convertedAmount = amountInUSD * USD_TO_EUR;
                break;
            case "GBP":
                convertedAmount = amountInUSD * USD_TO_GBP;
                break;
            case "JPY":
                convertedAmount = amountInUSD * USD_TO_JPY;
                break;
            default:
                System.out.println("Unsupported target currency.");
                return -1;
        }

        return convertedAmount;
    }
}
