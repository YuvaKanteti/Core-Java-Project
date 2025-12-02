package com.excelr.java.collectionframework;

public class Info6 {
	public static void main(String[] args) {
		int limit=10;
		
		int n1=0;
		int n2=1;
		System.out.println(n1);
	    System.out.println(n2);
		for(int i=0;i<=limit;i++) {
			
		    int sum = n1+n2;
		    n1=n2;
		    n2= sum;
		  System.out.println(sum);
		}
	}

}
