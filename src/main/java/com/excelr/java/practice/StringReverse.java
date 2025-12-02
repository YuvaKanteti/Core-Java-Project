package com.excelr.java.practice;

public class StringReverse {
	public static void main(String[] args) {
		String s="hello yuva";
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse +=s.charAt(i);
		}
		System.out.println(reverse);
		
		//stringbulider
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}

}
