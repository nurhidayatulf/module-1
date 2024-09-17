package com.nurhidayatulf.day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private List<LibraryMaterial> materials = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        manager.run();
    }

    public void run() {
        while (true) {
            try {
                System.out.println("\nHello Librarian! What task you will do?");
                System.out.println("1. Add Material");
                System.out.println("2. View Materials");
                System.out.println("3. Borrow Material");
                System.out.println("4. Return Material");
                System.out.println("5. Exit");
                System.out.print("Choose Option (1-5): ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addMaterial();
                        break;
                    case 2:
                        viewMaterials();
                        break;
                    case 3:
                        borrowMaterial();
                        break;
                    case 4:
                        returnMaterial();
                        break;
                    case 5:
                        System.out.println("Exiting Library Manager.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    public void addMaterial() {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Choose material type to add (1: Book, 2: Magazine, 3: Audiobook):");
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter title of the material:");
                String title = scanner.nextLine();

                System.out.println("Enter available count:");
                int availableCount = scanner.nextInt();
                scanner.nextLine();

                switch (type) {
                    case 1:
                        materials.add(new Book(title, availableCount));
                        System.out.println("Book added: " + title);
                        validInput = true;
                        break;
                    case 2:
                        materials.add(new Magazine(title, availableCount));
                        System.out.println("Magazine added: " + title);
                        validInput = true;
                        break;
                    case 3:
                        System.out.println("Enter duration (in minutes):");
                        int duration = scanner.nextInt();
                        materials.add(new Audiobook(title, availableCount, duration));
                        System.out.println("Audiobook added: " + title);
                        validInput = true;
                        break;
                    default:
                        System.out.println("Invalid type. Please enter 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter numbers for the type and available count.");
                scanner.nextLine();
            }
        }
    }

    public void viewMaterials() {
        if (materials.isEmpty()) {
            System.out.println("No materials in the library.");
        } else {
            for (LibraryMaterial material : materials) {
                material.printStatus();
                System.out.println();
            }
        }
    }

    public void borrowMaterial() {
        System.out.println("Enter title of material to borrow:");
        String title = scanner.nextLine();
        LibraryMaterial material = findMaterialByTitle(title);

        if (material != null) {
            material.borrow();
        } else {
            System.out.println("Material not found.");
        }
    }

    public void returnMaterial() {
        System.out.println("Enter title of material to return:");
        String title = scanner.nextLine();
        LibraryMaterial material = findMaterialByTitle(title);

        if (material != null) {
            material.returnMaterial();
        } else {
            System.out.println("Material not found.");
        }
    }

    private LibraryMaterial findMaterialByTitle(String title) {
        for (LibraryMaterial material : materials) {
            if (material.getTitle().equalsIgnoreCase(title)) {
                return material;
            }
        }
        return null;
    }
}
