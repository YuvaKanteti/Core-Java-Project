package com.excelr.java.practice;

public class Stringcount {
	public static void main(String[] args) {
		String s ="YuvaK@1234";
		int lowercasecount =0;
		int uppercasecount=0;
		int specialcharcount=0;
		int digitcount=0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowercasecount++;
			}
			else if(Character.isUpperCase(ch)) {
				uppercasecount++;
				
			}else if(Character.isDigit(ch)) {
				digitcount++;
				
			}else
				specialcharcount++;
			
		}
		System.out.println(lowercasecount);
		System.out.println(uppercasecount);
		System.out.println(digitcount);
		System.out.println(specialcharcount);
	}

}
