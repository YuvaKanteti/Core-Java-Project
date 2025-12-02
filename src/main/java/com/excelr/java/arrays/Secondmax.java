package com.excelr.java.arrays;

public class Secondmax {
	public static void main(String[] args) {
		int[] arr = {1,3,8,5,23};
		int n = arr.length;
		int max = arr[n-1];
		int secondmax =0;
		for(int i =0;i<n;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
			if(arr[i]<max) {
				secondmax =arr[i];
				break;
			}
		}
		System.out.println(secondmax);
	}
	

}
