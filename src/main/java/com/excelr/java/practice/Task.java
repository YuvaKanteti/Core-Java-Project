package com.excelr.java.practice;

public class Task {
	public static void main(String[] args) {
		char[]  a= {'1','e','s','4','i','t','u','7','t'};
		int vowelcount =0;
		int numbercount=0;
		int constantcount=0;
		for (int i=0; i< a.length;i++) {
			char ch = Character.toLowerCase(a[i]);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowelcount++;
		}
		else if(Character.isDigit(ch)) {
			numbercount++;
		}else {
			constantcount++;
		}
		
		}
		System.out.println(vowelcount);
		System.out.println(numbercount);
		System.out.println(constantcount);
	}

}
