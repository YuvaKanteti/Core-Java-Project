package com.excelr.java.practice;

public class FibbanacciSeries {
	public static void main(String[] args) {
		int n=0,n1=1;
		int num = 6;
		System.out.println(n);
		System.out.println(n1);
		for(int i=0;i<=num;i++) {
			int n2=n+n1;
			System.out.println(n2);
			n=n1;
			n1=n2;
			
			
		}
				
	}

}
