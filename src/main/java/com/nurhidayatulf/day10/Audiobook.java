package com.nurhidayatulf.day10;

public class Audiobook extends LibraryMaterial {
    private final int duration;

    public Audiobook(String title, int availableCount, int duration) {
        super(title, availableCount);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getType() {
        return "Audiobook";
    }
}
