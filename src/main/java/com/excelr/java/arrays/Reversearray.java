package com.excelr.java.arrays;

import java.util.Arrays;

public class Reversearray {
	public static void main(String[] args) {
		int[] arr= {1,7,5,9,6};
		int n= arr.length;
		for(int i = 0;i<n/2;i++) {
			int temp = arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	

}
