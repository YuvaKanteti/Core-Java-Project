package com.excelr.java.arrays;


import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class ForEach {
	public static void main(String[] args) {
		int[] array = {6,4,8,1,9};
		for(int i :array) {
			System.out.println(i);
		
		}
		Arrays.sort(array); // Sorts in ascending order
		System.out.println(Arrays.toString(array)); // Output: [1, 2, 3, 5, 8]
		
		Integer[] arr = {5, 1, 8, 3, 2};

        Arrays.sort(arr, Collections.reverseOrder()); // Sorting in descending order

        System.out.println(Arrays.toString(arr));
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

	}

}
