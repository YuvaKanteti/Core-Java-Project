package com.excelr.java.collectionframework;

public class Info8 {
	public static void main(String[] args) {
		String s = "aituve";
		int vowelscount=0;
		int consonantscount=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
				vowelscount++;
			}
			else {
				consonantscount++;
			}
				
		}
		System.out.println(vowelscount);
		System.out.println(consonantscount);
		}

}
