package com.excelr.java.practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=22;
		boolean isprime = true;
		
		if(num>1) {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0){
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.println("prime");
			}
			else
				System.out.println("not prime");

			
		}
		
	}

}
