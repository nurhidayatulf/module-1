package com.nurhidayatulf.day8;

import java.util.Scanner;

public class SimpleTicketingSystem {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. List of Events");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. List Booked Tickets");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ticketingSystem.listAvailableEvents();
                    break;

                case 2:
                    System.out.print("Enter Event Name: ");
                    String eventName = scanner.nextLine();
                    Event event = ticketingSystem.getEventByName(eventName);
                    if (event != null) {
                        System.out.println("Available tickets for " + eventName + ":");
                        for (Ticket ticket : event.getAvailableTickets()) {
                            System.out.println("Ticket ID: " + ticket.getId() + ", Price: " + ticket.getPrice());
                        }

                        System.out.print("Enter Ticket ID to book: ");
                        String ticketId = scanner.nextLine();
                        System.out.print("Enter your name: ");
                        String userName = scanner.nextLine();
                        ticketingSystem.bookTicket(eventName, ticketId, userName);
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter Ticket ID to cancel: ");
                    String ticketId = scanner.nextLine();
                    ticketingSystem.cancelTicketBooking(userName, ticketId);
                    break;

                case 4:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    User user = ticketingSystem.getUserByName(name);
                    user.listBookedTickets();
                    break;

                case 5:
                    System.out.println("Exiting Ticket System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}