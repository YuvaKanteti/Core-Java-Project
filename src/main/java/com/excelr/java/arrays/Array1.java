package com.excelr.java.arrays;

public class Array1 {public static void main(String[] args) {
	int [] arr = {1,2,9,6};
	int n = arr.length;
	boolean isSorted = true;
	for(int i=0;i<n;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
		}
	
	if(isSorted) {
		System.out.println("given array is sorted");
	}else
		System.out.println("not sorted");
}

}
