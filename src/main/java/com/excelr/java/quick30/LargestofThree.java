package com.excelr.java.quick30;

import java.util.Scanner;

public class LargestofThree {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a : ");
		int a =sc.nextInt();
		System.out.println("enter b : ");
		int b =sc.nextInt();
		System.out.println("enter c : ");
		int c =sc.nextInt();
		if((a>=b)&&(a>=c)) {
			System.out.println("a is the largest among three");
		}else if((b>=a)&&(b>=c)) {
			System.out.println("b is the largest among three");
		} else
			System.out.println("c is the largest among three");
	}

}
