package com.excelr.java.lambda;

public class AdditionLE {
	
	public interface Addition{
		double add (double a,double b,double c);
}
	public static void main(String[] args) {
		Addition ad = (a,b,c)-> a+b+c;
		System.out.println(ad.add(5,6,3));
		
	}

}
