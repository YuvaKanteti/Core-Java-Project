package com.excelr.java.basics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//palindrome a= 1001;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int n = sc.nextInt();
		int temp =0;
		int sum = 0;
		int a = n;
		while(n!=0) {
			temp=n%10;
			sum = sum*10+temp;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==a) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
