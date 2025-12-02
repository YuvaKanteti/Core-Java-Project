package com.excelr.java.assighnments;

import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary;
    }
}

public class EmployeeDetails {
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Add  2. Update  3. Delete  4. Display All  5. Search  6. Exit");
            System.out.print("Choose: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        add();
                        break;
                    case 2:
                        update();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        displayAll();
                        break;
                    case 5:
                        search();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = -1;
            }
        } while (choice != 6);
    }

    static void add() {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            if (employees.containsKey(id)) {
                System.out.println("Employee with this ID already exists.");
                return;
            }
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            employees.put(id, new Employee(id, name, dept, salary));
            System.out.println("Employee added successfully.");
        } catch (Exception e) {
            System.out.println("Invalid input. Try again.");
        }
    }

    static void update() {
        System.out.print("Enter ID to update: ");
        int id = Integer.parseInt(sc.nextLine());
        if (!employees.containsKey(id)) {
            System.out.println("Employee not found.");
            return;
        }
        Employee e = employees.get(id);
        System.out.print("Enter new name (" + e.name + "): ");
        e.name = sc.nextLine();
        System.out.print("Enter new department (" + e.department + "): ");
        e.department = sc.nextLine();
        System.out.print("Enter new salary (" + e.salary + "): ");
        e.salary = Double.parseDouble(sc.nextLine());

        System.out.println("Employee updated.");
    }

    static void delete() {
        System.out.print("Enter ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        if (employees.remove(id) != null)
            System.out.println("Employee deleted.");
        else
            System.out.println("Employee not found.");
    }

    static void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("All Employees:");
            for (Employee e : employees.values()) {
                System.out.println(e);
            }
        }
    }

    static void search() {
        System.out.print("Enter ID to search: ");
        int id = Integer.parseInt(sc.nextLine());
        Employee e = employees.get(id);
        if (e != null)
            System.out.println(e);
        else
            System.out.println("Employee not found.");
    }
}