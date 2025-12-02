package com.excelr.java.strings;

public class Strings1 {
	public static void main(String[] args) {
		String s ="Hello";
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			 reverse +=  s.charAt(i);
			
		}
		System.out.println(reverse);
		StringBuilder sb =new StringBuilder(s);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
	}

}
