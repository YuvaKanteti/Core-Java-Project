package com.excelr.java.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskArray {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8};
	        findDuplicates(arr);
	    }

	    public static void findDuplicates(int[] arr) {
	        Arrays.sort(arr); // Sort the array first
	        System.out.print("Duplicate elements: ");
	        
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] == arr[i + 1]) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	}

}
