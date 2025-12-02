package com.excelr.java.arrays;

public class MaxElement {
	public static void main(String[] args) {
		int[] array= {10,50,47484,283,383};
		
		int max = array[0];
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
