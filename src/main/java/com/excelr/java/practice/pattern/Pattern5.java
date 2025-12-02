package com.excelr.java.practice.pattern;

public class Pattern5 {
	public static void main(String[] args) {
		/*
		 ****
		  ***
		   **
		    *
		    */
		for (int i=0;i<=3;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=3-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
