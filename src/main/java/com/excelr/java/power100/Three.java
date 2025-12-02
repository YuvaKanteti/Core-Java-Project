package com.excelr.java.power100;

public class Three {
	public static void main(String[] args) {
		String str = "Hi my name is Yuva";
		int vowelcount =0;
		int consonantcount =0;
		for(int i =0; i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelcount++;
			}
			else 
				consonantcount++;
		}
		System.out.println(vowelcount);
		System.out.println(consonantcount);
		
		String str1 = str.replace(" ", "");
		System.out.println(str1);
	}

}
