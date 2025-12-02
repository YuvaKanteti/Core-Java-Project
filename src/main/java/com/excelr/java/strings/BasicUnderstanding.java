package com.excelr.java.strings;

public class BasicUnderstanding {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s);
		
		
		String s1 =" hello ".trim();
		System.out.println(s1);
		
		String s2 =" HELLO ";
		
		System.out.println(s2.trim());
		
		System.out.println(s2.toLowerCase());
				String s3 = "hello";
		System.out.println(s3.toUpperCase());
		
		String s4 = s3+"World";
		System.out.println(s4);
		
		System.out.println(s4.indexOf('l'));
		System.out.println(s4.lastIndexOf('l'));
		
		System.out.println(s4.length());
		System.out.println(s3.charAt(3));
		System.out.println(s4.substring(3,9));
		System.out.println(s4.replace('o','r'));
		String a="Hello";
		String b = "heLLo";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(s4.contains("elloW"));
		System.out.println(s4.startsWith("hel"));
		System.out.println(s4.endsWith("rld"));

	}

}
