package com.excelr.java.collectionframework;

import java.util.Arrays;

public class Info {
	public static void main(String[] args) {
		char[] arr = {'1','2','3','e','n','a'};
		System.out.println(Arrays.toString(arr));
		int vowelscount =0;
		int consonantscount =0;
		int digitcount =0;
		
		for(int i=0;i<arr.length;i++) {
			
			char ch = Character.toLowerCase(arr[i]);
			if(ch =='a'||ch =='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelscount++;
			}
			else if (Character.isDigit(ch)){
				digitcount++;
			}
			else {
				consonantscount++;
			}
		}
		System.out.println(vowelscount);
		System.out.println(consonantscount);
		System.out.println(digitcount);
	}

	
}
