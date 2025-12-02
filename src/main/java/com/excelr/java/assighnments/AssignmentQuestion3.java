package com.excelr.java.assighnments;
import java.util.*;

public class AssignmentQuestion3 {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> list = new ArrayList<>();
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        int choice = 0;
        do {
            try {
                System.out.println("\nCollection Management System");
                System.out.println("1. List Operations");
                System.out.println("2. Set Operations");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1: listOperations(); break;
                    case 2: setOperations(); break;
                    case 3: System.out.println("Exiting..."); break;
                    default: System.out.println("Invalid choice! Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        } while (choice != 3);
    }

    // List Operations
    private static void listOperations() {
        try {
            System.out.println("\nList Operations");
            displayList();
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Back");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: addToList(); break;
                case 2: removeFromList(); break;
                case 3: return;
                default: System.out.println("Invalid choice! Try again.");
            }
        } catch (Exception e) {
            System.out.println("Error during list operation: " + e.getMessage());
        }
    }

    private static void addToList() {
        System.out.print("Enter element to add: ");
        String element = scanner.nextLine();
        list.add(element);
        System.out.println("Element added.");
    }

    private static void removeFromList() {
        System.out.print("Enter element to remove: ");
        String element = scanner.nextLine();
        if (list.remove(element)) {
            System.out.println("Element removed.");
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    private static void displayList() {
        System.out.println("List: " + list);
    }

    // Set Operations
    private static void setOperations() {
        try {
            System.out.println("\nSet Operations");
            displaySet();
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Back");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: addToSet(); break;
                case 2: removeFromSet(); break;
                case 3: return;
                default: System.out.println("Invalid choice! Try again.");
            }
        } catch (Exception e) {
            System.out.println("Error during set operation: " + e.getMessage());
        }
    }

    private static void addToSet() {
        System.out.print("Enter element to add: ");
        String element = scanner.nextLine();
        if (set.add(element)) {
            System.out.println("Element added.");
        } else {
            System.out.println("Duplicate element. Set does not allow duplicates.");
        }
    }

    private static void removeFromSet() {
        System.out.print("Enter element to remove: ");
        String element = scanner.nextLine();
        if (set.remove(element)) {
            System.out.println("Element removed.");
        } else {
            System.out.println("Element not found in the set.");
        }
    }

    private static void displaySet() {
        System.out.println("Set: " + set);
    }
}