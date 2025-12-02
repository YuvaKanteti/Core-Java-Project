package com.excelr.java.mockprep;

public class Primecheck {
	public static void main(String[] args) {
		int number=13;
		boolean isPrime = true;
		if(number>1) {
			for(int i=2;i<=Math.sqrt(number);i++) {
				if(number%i==0) {
					isPrime =false;
				}
			}
			if(isPrime) {
				System.out.println("prime");
			}else
				System.out.println("not prime");
		}
	}

}
