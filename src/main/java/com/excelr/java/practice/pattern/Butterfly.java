package com.excelr.java.practice.pattern;

public class Butterfly {
	public static void main(String[] args) {
		/*
		 
	*      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *
		 
		 */
		int n = 4;
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		
			for(int j=2*(n-i);j>=1;j--) {
				System.out.print(" ");
			}for (int k= 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 for (int i = n; i >= 1; i--) {
	            // Left wing
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // Middle spaces
	            for (int j = 1; j <= 2 * (n - i); j++) {
	                System.out.print(" ");
	            }

	            // Right wing
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	
	}
//		 int n = 6;
//
//	        // Upper half
//	        for (int i = 1; i <= n; i++) {
//	            // Left wing
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//
//	            // Middle spaces
//	            for (int j = 1; j <= 2 * (n - i); j++) {
//	                System.out.print(" ");
//	            }
//
//	            // Right wing
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//
//	            System.out.println();
//	        }
//
//	        // Lower half
//	        for (int i = n; i >= 1; i--) {
//	            // Left wing
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//
//	            // Middle spaces
//	            for (int j = 1; j <= 2 * (n - i); j++) {
//	                System.out.print(" ");
//	            }
//
//	            // Right wing
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//
//	            System.out.println();
//	        }
//	    }

