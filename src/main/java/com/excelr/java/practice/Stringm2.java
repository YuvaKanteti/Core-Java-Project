package com.excelr.java.practice;

public class Stringm2 {
	public static void main(String[] args) {
		String str ="Hello";
		String reverse ="";
		for(int i =str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder reverseb = sb.reverse();
		System.out.println(sb);
	}

}
