package com.excelr.java.arrays;

public class Arrays2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,6,4,3};
		int n = arr.length;
		int duplicateelement = 0 ;
		for(int i=0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}		
			}
			break;
			
		}
		

	}

}
