package com.nurhidayatulf.day8;

import java.util.ArrayList;
import java.util.List;

public class TicketingSystem {
    private final List<Event> events;
    private final List<User> users;

    public TicketingSystem() {
        events = new ArrayList<>();
        users = new ArrayList<>();
        generateEventsName();
    }

    private void generateEventsName() {
        events.add(new Event("Book Fair", 5, 75.000));
        events.add(new Event("Conference", 3, 100.000));
        events.add(new Event("Game Station", 7, 65.000));
    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEventByName(String eventName) {
        for (Event event : events) {
            if (event.getEventName().equalsIgnoreCase(eventName)) {
                return event;
            }
        }
        return null;
    }

    public User getUserByName(String userName) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                return user;
            }
        }
        User newUser = new User(userName);
        users.add(newUser);
        return newUser;
    }

    public void listAvailableEvents() {
        System.out.println("Available Events:");
        for (Event event : events) {
            System.out.println("Event: " + event.getEventName() + " | Available Tickets: " + event.getAvailableTickets().size());
        }
    }

    public void bookTicket(String eventName, String ticketId, String userName) {
        Event event = getEventByName(eventName);
        if (event != null) {
            Ticket ticket = event.getTicketById(ticketId);
            if (ticket != null && ticket.isAvailable()) {
                ticket.setAvailable(false);
                User user = getUserByName(userName);
                user.addBookedTicket(ticket);
                System.out.println("Booking confirmed for " + userName + " for event: " + eventName);
                System.out.println("Ticket ID: " + ticket.getId() + ", Price: " + ticket.getPrice());
            } else {
                System.out.println("Ticket is not available.");
            }
        } else {
            System.out.println("Event not found.");
        }
    }

    public void cancelTicketBooking(String userName, String ticketId) {
        User user = getUserByName(userName);
        user.cancelTicket(ticketId);
    }
}