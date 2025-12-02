package com.excelr.java.practice;

public class stringulm2 {
	public static void main(String[] args) {
		String str ="Aa1Bb2Cc3Dd4";
		int uppercasecount =0;
		int lowercasecount =0;
		int digitcount =0;
		for (int i=0 ;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				uppercasecount++;
			}else if (Character.isLowerCase(c)) {
				lowercasecount++;
			}else if(Character.isDigit(c)) {
				digitcount++;
			}
			
		}
		
		System.out.println(uppercasecount);
		System.out.println(lowercasecount);
		System.out.println(digitcount);
	
	}
	

}
