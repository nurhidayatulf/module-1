package com.nurhidayatulf.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SummaryOfProductSales {
    public static void main(String[] args) {
        String csvFile = "src/product_sales_data.csv";
        String line;
        String csvSplitBy = ",";

        Map<String, Integer> productSales = new HashMap<>();
        double totalSales = 0.0;
        int totalProductsSold = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                if (data.length != 3) {
                    System.out.println("Invalid data format: " + line);
                    continue;
                }

                String product = data[0].trim();
                int quantity;
                double price;

                try {
                    quantity = Integer.parseInt(data[1].trim());
                    price = Double.parseDouble(data[2].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing number: " + e.getMessage());
                    continue;
                }

                productSales.put(product, productSales.getOrDefault(product, 0) + quantity);
                totalSales += quantity * price;
                totalProductsSold += quantity;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        String mostBoughtProduct = null;
        String leastBoughtProduct = null;
        int maxQuantity = Integer.MIN_VALUE;
        int minQuantity = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : productSales.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();

            if (quantity > maxQuantity) {
                maxQuantity = quantity;
                mostBoughtProduct = product;
            }

            if (quantity < minQuantity) {
                minQuantity = quantity;
                leastBoughtProduct = product;
            }
        }

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Total Product Sold: " + totalProductsSold);
        System.out.println("Most Bought Product: " + (mostBoughtProduct != null ? mostBoughtProduct : "N/A"));
        System.out.println("Least Bought Product: " + (leastBoughtProduct != null ? leastBoughtProduct : "N/A"));
    }
}
