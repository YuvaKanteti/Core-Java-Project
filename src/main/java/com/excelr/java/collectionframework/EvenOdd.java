package com.excelr.java.collectionframework;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nnumber :");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}
		sc.close();
		
	}

}
