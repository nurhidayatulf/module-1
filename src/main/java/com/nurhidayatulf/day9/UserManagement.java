package com.nurhidayatulf.day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManagement {
    private final Map<String, User> users;
    private User loggedInUser;

    public UserManagement() {
        this.users = new HashMap<>();
    }

    public void registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists. Try again.");
        } else {
            User newUser = new User(username, password);
            users.put(username, newUser);
            System.out.println("Registration successful!");
        }
    }

    public boolean loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            loggedInUser = user;
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password. Try again.");
            return false;
        }
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void logout() {
        loggedInUser = null;
    }
}
