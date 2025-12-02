package com.excelr.java.arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// compares adjacent elements and sort it at last we get the largest element in the array
		int[] arr= {10,60,30,90,40};
		int temp=0;
		for(int i = 0; i < arr.length - 1; i++) {           // Outer loop for passes
		    for(int j = 0; j < arr.length - i - 1; j++) {   // Inner loop for comparison
		        if(arr[j] > arr[j+1]) {                     // If current > next, swap
		             temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
	}

}
