package com.excelr.java.lambda;
interface MyFunctionalInterface{
	MyClass createInstance(); 
}
class MyClass{
	public static void myStaticFunction() {
		System.out.println("SF");
	}
	public static void myNonStaticFunction() {
		System.out.println("NSF");
	}
}

public class MethodRefferanceBasics {
	public static void main(String[] args) {
		//Method Referance for Static Function
		Runnable staticMethodReferance = MyClass::myStaticFunction;
		staticMethodReferance.run();
		
		Runnable nonStaticMethodReferance = MyClass::myNonStaticFunction;
		nonStaticMethodReferance.run();
		
		Runnable nonStaticMethodReferance1 = myClassInstance::myNonStaticFunction;
		nonStaticMethodReferance1.run();
	}

}
