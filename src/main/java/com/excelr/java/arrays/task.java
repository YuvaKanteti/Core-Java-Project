package com.excelr.java.arrays;

public class task {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7,8,4,3,5,7};
		int n = arr.length;
		int count=0;
		for(int i =0;i<n;i++) {
			if(arr[i]%2==0) {
				count ++;
			}
		}
		System.out.println("the number of even numbers in the array = "+count);
	}

}
