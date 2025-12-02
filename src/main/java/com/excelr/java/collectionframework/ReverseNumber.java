package com.excelr.java.collectionframework;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		sc.close();
		reverseNumber(number);

	}
	public static void reverseNumber(int number) {
		int reversed=0;
		while(number>0) {
			int lastdigit = number%10;
			reversed = (reversed*10)+lastdigit;
			number = number /10;
		}
		System.out.println(reversed);
	}

}
