package com.excelr.java.basics.exceptionhandling;

public class PracticeExample {
	public static void main(String[] args) {
		int a=10;
		int b=0;

		try {
			int c=a/b;
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			System.out.println("Finally block excecuted");
		}

	}

}
