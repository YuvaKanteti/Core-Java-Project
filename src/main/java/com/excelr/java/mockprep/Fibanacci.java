package com.excelr.java.mockprep;

public class Fibanacci {
	public static void main(String[] args) {
		int target =10;
		int n = 0;
		int n1 = 1;
		System.out.println(n);
		System.out.println(n1);
		for(int i =0; i<=target;i++) {
			int temp = n+n1;
			n=n1;
			n1=temp;
			System.out.println(temp);
		}
	}

}
