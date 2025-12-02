package com.excelr.java.collectionframework;

public class Info3 {
	public static void main(String[] args) {
		String r = "Yuva";
		String reverse ="";
		for(int i =r.length()-1;i>=0;i--) {
			char ch = r.charAt(i);
			 reverse = reverse+ ch;
		}
		System.out.println(reverse);
	}

}
