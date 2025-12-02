package com.excelr.java.arrays;

public class Linearsearch {
	public static void main(String[] args) {
		int[] arr = {1,4,7,3,8,5};
		int key = 88377;
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				found=true;
				System.out.println("Element found at index :"+i);
			}

		}
		if(!found) {
			System.out.println("element not found");
		}
	}

}
