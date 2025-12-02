package com.excelr.java.practice;

public class sum2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,5};
		int n =a.length+1;
		int expectedsum =n*(n+1)/2;
		int actualsum =0;
		for(int i =0;i<a.length;i++) {
			actualsum += a[i]; 
		}
		System.out.println(expectedsum-actualsum);
	}

}
