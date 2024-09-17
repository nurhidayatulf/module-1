package com.nurhidayatulf.day10;

public class Magazine extends LibraryMaterial {
    public Magazine(String title, int availableCount) {
        super(title, availableCount);
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}

