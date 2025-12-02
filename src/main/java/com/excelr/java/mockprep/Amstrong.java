package com.excelr.java.mockprep;

public class Amstrong {
	public static void main(String[] args) {
		int n = 154;
		int sum=0;
		int a=n;
		while(n!=0) {
			int r =n%10;
		    sum = sum+(r*r*r);
		    n=n/10;
		}
		System.out.println(sum);
		if(a==sum) {
			System.out.println("amstrong");
		}else 
			System.out.println("not Amstrong");
	}

}
