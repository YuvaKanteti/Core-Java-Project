package com.excelr.java.patterns;

public class Pattern6 {
	public static void main(String[] args) {
		/*
		    *    
           * *   
          * * *  
         * * * * 
        * * * * *
         * * * * 
          * * *  
           * *   
            *  
		 */
		int i,j,k,n=5;
		//upper triangle
		for(i=1;i<=n;i++) {
			for(k=i;k<n;k++) {
				System.out.print(" ");
			}
		
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//lower trianglr
	}

}
