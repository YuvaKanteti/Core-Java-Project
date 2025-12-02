// a) Class and Object, b) Constructor, c) Method Overloading
package com.excelr.java.assighnments;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void showInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    void showInfo(String role) {
        System.out.println(role + ": " + name);
    }
}
// e) Inheritance, d) Method Overriding
class Patient extends Person {
    String disease;

    Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    @Override
    void showInfo() {
        System.out.println(name + " (Patient) has " + disease);
    }
}

// g) Abstract class
abstract class Staff {
    abstract void work();
}

// f) Interface
interface Consultant {
    void consult();
}

class Doctor extends Staff implements Consultant {
    public void work() {
        System.out.println("Doctor is treating patients.");
    }

    public void consult() {
        System.out.println("Doctor gives medical advice.");
    }
}

public class HealthcareOOP {
    public static void main(String[] args) {
        Person p = new Person("Swetha", 23);
        p.showInfo();
        p.showInfo("Visitor");

        Patient pat = new Patient("John", 45, "Diabetes");
        pat.showInfo();

        Doctor doc = new Doctor();
        doc.work();
        doc.consult();
    }
}
