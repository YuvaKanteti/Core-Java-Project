package com.excelr.java.patterns;

public class Pattern8 {
	public static void main(String[] args) {
		/*
		   *    
	      * *   
	     *   *  
	    *     * 
	   * * * * *
	*/
		 int n = 5; // Number of rows
	     for (int i = 1; i <= n; i++) { 
	         // Print spaces
	         for (int j = n-1; j>=i; j--) {
	             System.out.print(" ");
	         }
	         // Print stars and spaces
	         for (int j = 1; j <= (2 * i - 1); j++) {
	             if (j == 1 || j == (2 * i - 1) || i == n) {
	                 System.out.print("*"); // Print '*' for border
	             } else {
	                 System.out.print(" "); // Print space for hollow part
	             }
         }
	         System.out.println(); // Move to the next line
	     }
	}
	

}

