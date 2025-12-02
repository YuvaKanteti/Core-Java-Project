package com.excelr.java.basics;

public class Test {
	public void nonStaticMethod() {
		System.out.println("Hello");
	}
	
public static void main(String[] args) {
	Test ob = new Test();
	ob.nonStaticMethod();
}	
}