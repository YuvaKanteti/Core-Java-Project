package com.excelr.java.practice;

import java.util.Scanner;

public class NoOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int num = sc.nextInt();
		int temp = 0;
		int count =0;
		while(num!=0){
			num = num/10;
			count++;
		}
		System.out.println("Number of digits for the given number is : "+count);
		
	}
	

}
