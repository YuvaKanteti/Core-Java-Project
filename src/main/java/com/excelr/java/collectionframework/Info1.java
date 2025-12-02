package com.excelr.java.collectionframework;

import java.util.Arrays;

public class Info1 {
	public static void main(String[] args) {
		int[] arr = {1,56,97,655,6,655};
		int secondlarge=0;
		
		Arrays.sort(arr);
		
		int large = arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]!=large) {
				secondlarge =arr[i];
				break;
			}
			
		}
		System.out.println(secondlarge);
	}

}
