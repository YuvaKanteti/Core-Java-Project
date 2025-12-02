package com.excelr.java.collectionframework;

public class Info2 {
	public static void main(String[] args) {
		String str = "aeiouABYqtr2345";
		int lowercasecount=0;
		int uppercasecount=0;
		int numbercount=0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowercasecount++;
			}
			else if(Character.isUpperCase(ch)) {
				uppercasecount++;
			}
			else
				numbercount++;
		}
		System.out.println(lowercasecount);
		System.out.println(uppercasecount);
		System.out.println(numbercount);
	}

}
