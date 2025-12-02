package com.excelr.java.practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int s1 = sc.nextInt();
		Boolean isPrime = true;
		if(s1>1) {
		  for (int i =2;i<=Math.sqrt(s1);i++) {
			  if(s1%i ==0) {
				  isPrime=false;
				  break;
			  }
			
		  }
		  if(isPrime) {
				System.out.println("prime");
			}
			else
				System.out.println("nopt prime");
		}
		
	}

}
