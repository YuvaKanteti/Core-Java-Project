package com.excelr.java.quick30;

import java.util.Arrays;

public class SecondMaxandMin {
	public static void main(String[] args) {
		int [] a = {1,4,2,7,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int n =a.length;
		int secondmax = a[n-2];
		System.out.println(secondmax);
		int secondmin =a[1];
		System.out.println(secondmin);
	}

}
