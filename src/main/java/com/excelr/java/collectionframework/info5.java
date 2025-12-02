package com.excelr.java.collectionframework;

public class info5 {
	public static void main(String[] args) {
		int n= 10;
		Boolean isPrime = true;
		
		if (n>1) {
			for(int i =2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime =false;
					break;
				}
			}
			
		}
		if(isPrime) {
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
	}

}
