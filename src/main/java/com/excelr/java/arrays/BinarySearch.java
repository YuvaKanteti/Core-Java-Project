package com.excelr.java.arrays;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
	int[] arr= {10,50,30,40};
	Arrays.sort(arr);
	System.out.println("sorted array: "+Arrays.toString(arr));
	
	int key = 30;
	
	int low =0;
	int high = arr.length-1;
	
	boolean found=false;
	
	while(low<=high) {
		int mid = (low+high)/2;
		if(arr[mid]==key) {
			System.out.println("element found at index : "+mid);
			break;
		}
		else if (arr[mid]<key){
			low=mid+1;
		}
		else
			high=mid-1 	;
	}
	if(!found) {
		System.out.println("element not found");
	}
	}
}


