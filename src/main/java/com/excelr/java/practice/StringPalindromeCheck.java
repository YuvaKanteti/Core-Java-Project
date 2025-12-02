package com.excelr.java.practice;

public class StringPalindromeCheck {
	public static void main(String[] args) {
		String s1 = "mada";
		String Reverse = "";
		for(int i= s1.length()-1;i>=0;i--) {
			Reverse += s1.charAt(i);
			
		}
		if(s1.equals(Reverse)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not palindrome");
	}
}
