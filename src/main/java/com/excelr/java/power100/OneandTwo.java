package com.excelr.java.power100;

public class OneandTwo {
	public static void main(String[] args) {
		String str = "Yuva";
		String reverse="";
		String str1 = str;
		for(int i =str.length()-1 ;i>=0;i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
		if(reverse==str1) {
			System.out.println("String is palindrome");
		}
		else
			System.out.println("string is not palindrome");
	}

}
