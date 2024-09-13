package com.nurhidayatulf.day9;

import java.util.Scanner;

public class ToDoManager {

    public void addTask(User user, Scanner scanner) {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(description);
        user.addTask(task);
        System.out.println("Task added successfully!");
    }

    public void viewTasks(User user) {
        if (user.getTasks().isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Your tasks:");
            for (Task task : user.getTasks()) {
                System.out.println(task);
            }
        }
    }

    public void deleteTask(User user, Scanner scanner) {
        System.out.print("Enter task ID to delete: ");
        String taskId = scanner.nextLine();
        Task taskToRemove = null;
        for (Task task : user.getTasks()) {
            if (task.getId().equals(taskId)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            user.removeTask(taskToRemove);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task ID not found.");
        }
    }
}
