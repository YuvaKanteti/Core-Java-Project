package com.excelr.java.practice;

public class M1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		int n= arr.length+1;
		int expectedoutput = n*(n+1)/2;
		int actualoutput =0;
		int missing =0;
		for(int num : arr) {
			actualoutput+= num;
			 missing = expectedoutput-actualoutput;
			

		}
		System.out.println(missing);
	}

}
