package com.excelr.java.quick30;

import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		int [] arr = {1,2,8,6,4};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
