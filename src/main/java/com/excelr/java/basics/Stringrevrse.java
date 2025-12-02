package com.excelr.java.basics;

public class Stringrevrse {
	public static void main(String[] args) {
		String s = "Hello yuva";
		String s1=s;
		String Reverse= "";
		for(int i =s.length()-1;i>=0;i--) {
			Reverse += s.charAt(i);
		}
		System.out.println(Reverse);
		if(Reverse.equals(s1)) {
			System.out.println("String is palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
