package com.excelr.java.collectionframework;

public class Info10 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,423,5,60};
		int large = arr[5];
		int small= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
				break;
			}
			if(arr[i]<small) {
				small =arr[i];
				break;
			}
		}
		System.out.println(large);
		System.out.println(small);
	}

}
