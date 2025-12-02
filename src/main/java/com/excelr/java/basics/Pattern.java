package com.excelr.java.basics;

public class Pattern {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j= n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

}
