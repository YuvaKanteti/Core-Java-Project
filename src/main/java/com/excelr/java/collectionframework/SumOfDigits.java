package com.excelr.java.collectionframework;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		int sum=0;
		int temp = number;
		sc.close();
		
		while(temp>0) {
			sum = sum+temp%10;
			temp= temp/10;
		}
		System.out.println(sum);
	}

}
