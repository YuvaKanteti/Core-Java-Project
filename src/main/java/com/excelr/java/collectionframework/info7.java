package com.excelr.java.collectionframework;

public class info7 {
	public static void main(String[] args) {
		int n =73673;
		int sum =0;
		int temp =n;
		while(n!=0) {
			int r = n%10;
		    sum = sum*10+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else
		System.out.println("not palindrome");
	}

}
