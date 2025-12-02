package com.excelr.java.arrays;

public class task4 {
	public static void main(String[] args) {
		//max element
		int[] a= {1,3,4,5,6,7,3};
		int n = a.length;
		int maxelement = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>maxelement) {
				maxelement=a[i];
				
			}
				
		}
		System.out.println(maxelement);
	}

}
