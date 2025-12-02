package com.excelr.java.arrays;

public class task1 {
	public static void main(String[] args) {
		String s="abaftt";
		int n = s.length();
		boolean isDuplicate = false;
		for(int i =0 ;i<n;i++) {
			char a = s.charAt(i);
			System.out.println(a);
			for(int j = 0;j<n;j++) {
			if(s.charAt(j)==a) {
				isDuplicate = true;
			}
		}
			if(isDuplicate) {
			System.out.println(a);
			}
		}
	}

}
