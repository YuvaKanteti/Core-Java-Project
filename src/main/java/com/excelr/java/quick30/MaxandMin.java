package com.excelr.java.quick30;

public class MaxandMin {
	public static void main(String[] args) {
		int[] a = {2,9,1,56,34};
		int n =a.length;
		int max =a[0];
		int min = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min =a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
