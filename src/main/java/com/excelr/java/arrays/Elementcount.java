package com.excelr.java.arrays;

public class Elementcount {
	public static void main(String[] args) {
		int[] array = {5,7,9,5,5,9,5};
		
		int count =0;
		for (int i =0 ;i< array.length;i++) {
			if(array[i]==5) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
