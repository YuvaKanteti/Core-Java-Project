package com.excelr.java.assighnments;

	import java.util.Scanner;

	public class StringOperations {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();

	        System.out.println("Enter starting index for substring:");
	        int startIndex = Integer.parseInt(scanner.nextLine());

	        System.out.println("Enter ending index for substring:");
	        int endIndex = Integer.parseInt(scanner.nextLine());

	        if (startIndex >= 0 && endIndex <= inputString.length() && startIndex < endIndex) {
	            String substring = inputString.substring(startIndex, endIndex);
	            System.out.println("Extracted substring: " + substring);
	        } else {
	            System.out.println("Invalid indices! Ensure start < end, and indices are within the string length.");
	        }

	      
	        System.out.println("\nEnter a sentence to split:");
	        String sentence = scanner.nextLine();
	        String[] words = sentence.split("\\s+");
	        System.out.println("Words in the sentence:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        scanner.close();
	    }
	}


