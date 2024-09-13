package com.nurhidayatulf.day8;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private final String eventName;
    private final List<Ticket> tickets;

    public Event(String eventName, int numberOfTickets, double ticketPrice) {
        this.eventName = eventName;
        this.tickets = new ArrayList<>();
        for (int i = 0; i < numberOfTickets; i++) {
            tickets.add(new Ticket(eventName + "-T" + (i + 1), eventName, ticketPrice));
        }
    }

    public String getEventName() {
        return eventName;
    }

    public List<Ticket> getAvailableTickets() {
        List<Ticket> availableTickets = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.isAvailable()) {
                availableTickets.add(ticket);
            }
        }
        return availableTickets;
    }

    public Ticket getTicketById(String ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(ticketId) && ticket.isAvailable()) {
                return ticket;
            }
        }
        return null;
    }
}
