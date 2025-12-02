package com.excelr.java.basics;

import java.util.Scanner;

public class SwppTwonumbers {
	public static void main(String[] args) {
//		int a= 10;
//		int b= 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		
		System.out.println("Before swap : a = "+a+" b = "+b);
		
		System.out.print("After swap : a = "+((a+b)-a));
		System.out.print(" b = "+((a+b)-b));
	}

}
