package com.excelr.java.practice;

public class AmdtrongNumber {
	public static void main(String[] args) {
		int num = 999;
		int temp=num;
		int r =0;
		int sum=0;
		
		while(num!=0) {
			r = num%10;
			sum += (r*r*r);
			num=num/10;
			
	    }
		
		if(temp==sum) {
			System.out.println("amstrong");
		}
		else
			System.out.println("not amstrong");

}
}
