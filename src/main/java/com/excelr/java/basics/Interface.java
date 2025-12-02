package com.excelr.java.basics;


	class Animal {
	    void sound() {
	        System.out.println("Animal sound");
	    }
	}

	class Dog extends Animal {
	    void sound() {
	        System.out.println("Bark");
	    }
	}

	public class Interface {
	    public static void main(String[] args) {
	        Dog a = new Dog();  // Reference is of parent, object is of child
	        a.sound();             // Output: Bark (method from Dog class)
	    }
	}


