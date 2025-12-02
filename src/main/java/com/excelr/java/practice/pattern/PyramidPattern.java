package com.excelr.java.practice.pattern;

public class PyramidPattern {
	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=num-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = num - 1; i >= 1; i--) {
		    for(int j = 1; j <= num - i; j++) { // ✅ spaces increase
		        System.out.print(" ");
		    }
		    for(int k = 1; k <= i; k++) {       // ✅ stars decrease
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}

}
