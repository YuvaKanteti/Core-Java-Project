package com.excelr.java.lambda;

public class Evenodd {
	public interface Number{
		int num(int a);
		
	}
	public static void main(String[] args) {
		Number eveod = (a) -> {
			if(a%2==0) {
				System.out.println(a+" is even ");
				return a;
			}
			else 
				System.out.println(a+" is odd");
			return a;
		};
		int result = eveod.num(145);	
	}

}
