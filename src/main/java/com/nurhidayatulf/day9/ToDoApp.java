package com.nurhidayatulf.day9;

import java.util.Scanner;

public class ToDoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        TaskManagement taskManagement = new TaskManagement();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- WELCOME TO TODO LIST APP ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                continue;
            }

            switch (choice) {
                case 1:
                    userManagement.registerUser(scanner);
                    break;
                case 2:
                    if (userManagement.loginUser(scanner)) {
                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("\n--- Hello " + userManagement.getLoggedInUser().getUsername() + " , Welcome! ---" );
                            System.out.println("--- TODO LIST MENU ---");
                            System.out.println("1. Add Task");
                            System.out.println("2. View Tasks");
                            System.out.println("3. Delete Task");
                            System.out.println("4. Logout");
                            System.out.print("Choose an option: ");

                            int taskChoice = -1;

                            try {
                                taskChoice = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a number (1-4).");
                                continue;
                            }

                            switch (taskChoice) {
                                case 1:
                                    taskManagement.addTask(userManagement.getLoggedInUser(), scanner);
                                    break;
                                case 2:
                                    taskManagement.viewTasks(userManagement.getLoggedInUser());
                                    break;
                                case 3:
                                    taskManagement.deleteTask(userManagement.getLoggedInUser(), scanner);
                                    break;
                                case 4:
                                    userManagement.logout();
                                    loggedIn = false;
                                    System.out.println("Logged out successfully.");
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the application. See yaw!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}