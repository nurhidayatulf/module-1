package com.nurhidayatulf.day10;

public abstract class LibraryMaterial {
    private String title;
    private int availableCount;
    private int borrowedCount;

    public LibraryMaterial(String title, int availableCount) {
        this.title = title;
        this.availableCount = availableCount;
        this.borrowedCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return availableCount > 0;
    }

    public void borrow() {
        if (isAvailable()) {
            availableCount--;
            borrowedCount++;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available for borrowing.");
        }
    }

    public void returnMaterial() {
        if (borrowedCount > 0) {
            borrowedCount--;
            availableCount++;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " has not been borrowed.");
        }
    }

    public void printStatus() {
        System.out.println(getType() + " - " + title + ": Available: " + availableCount + ", Borrowed: " + borrowedCount);
    }

    public abstract String getType();
}
