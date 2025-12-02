package com.excelr.java.oops;


	
//Abstraction (Abstract Class)
abstract class Employee {
 private String name;
 private int id;

 // Constructor
 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Encapsulation - Getters
 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }

 // Abstract method (Implemented differently for full-time and part-time employees)
 public abstract double calculateSalary();

 // Display employee details
 public void displayEmployeeInfo() {
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Name: " + name);
 }
}

//Inheritance - FullTimeEmployee extends Employee
class FullTimeEmployee extends Employee {
 private double monthlySalary;

 public FullTimeEmployee(String name, int id, double monthlySalary) {
     super(name, id);
     this.monthlySalary = monthlySalary;
 }

 // Polymorphism - Overriding calculateSalary
 @Override
 public double calculateSalary() {
     return monthlySalary;
 }
}

//Inheritance - PartTimeEmployee extends Employee
class PartTimeEmployee extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 // Polymorphism - Overriding calculateSalary
 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}

//Main Class
public class EmployeeManagement {
 public static void main(String[] args) {
     // Creating Full-Time Employee
     FullTimeEmployee fullTimeEmp = new FullTimeEmployee("yuva", 101, 5000);
     
     // Creating Part-Time Employee
     PartTimeEmployee partTimeEmp = new PartTimeEmployee("vasu", 102, 20, 80);

     // Displaying Details and Salaries
     fullTimeEmp.displayEmployeeInfo();
     System.out.println("Salary: " + fullTimeEmp.calculateSalary());

     System.out.println("--------------------");

     partTimeEmp.displayEmployeeInfo();
     System.out.println("Salary: " + partTimeEmp.calculateSalary());
 }
}