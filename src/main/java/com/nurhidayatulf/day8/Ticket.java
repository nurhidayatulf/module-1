package com.nurhidayatulf.day8;

public class Ticket {
    private final String id;
    private final String eventName;
    private final double price;
    private boolean available;

    public Ticket(String id, String eventName, double price) {
        this.id = id;
        this.eventName = eventName;
        this.price = price;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}