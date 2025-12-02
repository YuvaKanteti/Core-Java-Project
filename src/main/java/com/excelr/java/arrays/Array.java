package com.excelr.java.arrays;

public class Array {
	public static void main(String[] args) {
		int[] arr = {1,54,3,36,8,5,4,6};
		int n = arr.length;
		int oddcount=0;
		int evencount =0;
		for(int i =0;i<n;i++) {
			if(arr[i]%2==0) {
				evencount++;
			}
			else
				oddcount++;
		}
		System.out.println("even : "+evencount);
		System.out.println("odd : "+oddcount);
	}

}
