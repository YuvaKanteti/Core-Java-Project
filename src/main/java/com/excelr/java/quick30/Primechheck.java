package com.excelr.java.quick30;

public class Primechheck {
	public static void main(String[] args) {
		int n =11;
		boolean isPrime = false;
		while(n>0){
			for(int i =2;i<=n;i++) {
				if(n%i==0) {
					isPrime =true;
					break;
				}
			}
			
		}
		if(isPrime) {
			System.out.println("Prime number");
		}else
			System.out.println("Not Prime");
		
	}
	

}
