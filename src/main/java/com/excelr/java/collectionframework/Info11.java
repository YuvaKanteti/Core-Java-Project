package com.excelr.java.collectionframework;

public class Info11 {
	public static void main(String[] args) {
		int n =153;
		int sum=0;
		int temp=n;
		while(n!=0) {
			int r = n%10;
			sum = (r*r*r)+sum;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==temp) {
			
		}
	}
	

}
