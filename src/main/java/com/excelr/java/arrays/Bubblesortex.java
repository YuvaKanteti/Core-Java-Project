package com.excelr.java.arrays;

import java.util.Arrays;

public class Bubblesortex {
	public static void main(String[] args) {
		int[] arr = {1,10,8,7,6};
		int n =arr.length;
		for(int i =0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[n-2]);
	}

}
