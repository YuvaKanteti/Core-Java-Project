
package com.excelr.java.arrays;

public class Multidimentional {
	public static void main(String[] args) {
		int[][] array = {{1,6,8},
				        {8,9,9}};
		System.out.println(array[1][1]);
		for(int i = 0; i<array.length;i++) {
			for(int j = 0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
