package com.excelr.java.arrays;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] source = {9,8,7};
		int[] array = new int[source.length];
		array =Arrays.copyOfRange(source,0,source.length);
		System.out.println(Arrays.toString(array));

	}
	
}
