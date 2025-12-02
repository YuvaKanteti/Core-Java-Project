package com.excelr.java.quick30;

import java.util.Arrays;

public class Removeduplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,9,9,6,6};
		int n =arr.length;
		for(int i =0;i<n;i++) {
			boolean isDuplicate = false;
			for(int j = 0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate  =true;
					break;
				}
				
			}
			if(!isDuplicate) {
				System.out.println(arr[i]);
				}
		}
		System.out.println(Arrays.toString(arr));
	}

}
