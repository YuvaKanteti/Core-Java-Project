package com.excelr.java.collectionframework;

public class Info4 {
	public static void main(String[] args) {
		String s ="hello";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
		StringBuilder sb1 = new StringBuilder(s);
		StringBuilder rversed = sb1.reverse();
		System.out.println(rversed);
	}

}
