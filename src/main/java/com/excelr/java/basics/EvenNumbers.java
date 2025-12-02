package com.excelr.java.basics;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limt: ");
		int limit = sc.nextInt();
		sc.close();
		
		for(int i =1; i<=limit; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
