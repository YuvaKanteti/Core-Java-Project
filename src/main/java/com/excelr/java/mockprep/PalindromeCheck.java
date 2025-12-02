package com.excelr.java.mockprep;

public class PalindromeCheck {
	public static void main(String[] args) {
		int n =1991;
		int sum=0;
		int temp =0;
		int a=n;
		while(n!=0) {
			temp = n%10;
			sum= sum*10+temp;
			n=n/10;
		}
		System.out.println(sum);
		if(a==sum) {
			System.out.println("palindrome");
		}else
			System.out.println("Not Palindrome");
	
	}

}
