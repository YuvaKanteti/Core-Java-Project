package com.excelr.java.basics;

public class Arraym2 {
	public static void main(String[] args) {
		char[] arr = {'a','e','f','g','i'};
		int vowelcount = 0;
		int constantcount =0;
		for(int i =0;i<arr.length;i++) {
			char c = arr[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowelcount++;
			}
			else
				constantcount++;
		}
		System.out.println(vowelcount);
		System.out.println(constantcount);
	}

}
