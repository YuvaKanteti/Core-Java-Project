package com.excelr.java.quick30;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int[] a = {454,87,56,485,9};
		int n =a.length;
		for(int i =0;i<n-1;i++) {
			for(int j =0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
		int secondmax = a[n-2];
		System.out.println(secondmax);
		int secondmin =a[1];
		System.out.println(secondmin);
	}

}
