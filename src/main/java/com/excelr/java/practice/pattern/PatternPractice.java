package com.excelr.java.practice.pattern;

public class PatternPractice {
	public static void main(String[] args) {
		/*
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
*/
		
		int num = 5;
		for(int i=1;i<=num;i++) {
			for(int j=num-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
