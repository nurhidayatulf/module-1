package com.nurhidayatulf.day8;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private final List<Ticket> bookedTickets;

    public User(String name) {
        this.name = name;
        this.bookedTickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBookedTicket(Ticket ticket) {
        bookedTickets.add(ticket);
    }

    public void cancelTicket(String ticketId) {
        Ticket ticketToCancel = null;
        for (Ticket ticket : bookedTickets) {
            if (ticket.getId().equals(ticketId)) {
                ticketToCancel = ticket;
                ticket.setAvailable(true);
                break;
            }
        }
        if (ticketToCancel != null) {
            bookedTickets.remove(ticketToCancel);
            System.out.println("Ticket " + ticketId + " has been canceled.");
        } else {
            System.out.println("Ticket not found in your bookings.");
        }
    }

    public void listBookedTickets() {
        if (bookedTickets.isEmpty()) {
            System.out.println("No tickets booked.");
        } else {
            System.out.println("Your Booked Tickets:");
            for (Ticket ticket : bookedTickets) {
                System.out.println("Ticket ID: " + ticket.getId() + ", Event: " + ticket.getEventName() + ", Price: " + ticket.getPrice());
            }
        }
    }
}
