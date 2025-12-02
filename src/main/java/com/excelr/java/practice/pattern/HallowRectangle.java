package com.excelr.java.practice.pattern;

public class HallowRectangle {
	public static void main(String[] args) {
		int row=4, coloumn=4;
		int i;
		for(i=1;i<=row;i++) {
			for(int j=1;j<=coloumn;j++) {
				if(i==1||i==row||j==1||j==coloumn) {
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
