package com.excelr.java.practice;

public class IntergerReverse {
	public static void main(String[] args) {
		int num = 384;
		int palnum = num;
		int temp =0;
		int reverse= 0;
		while(num>0) {
			temp = num%10;
			reverse=reverse*10+temp;
			num = num/10;
			
		
		}
		System.out.println(reverse);
		if(reverse == palnum) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("not palindrome");
		
	}
}
