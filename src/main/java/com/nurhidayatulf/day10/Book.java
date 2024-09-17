package com.nurhidayatulf.day10;

public class Book extends LibraryMaterial {
    public Book(String title, int availableCount) {
        super(title, availableCount);
    }

    @Override
    public String getType() {
        return "Book";
    }
}
