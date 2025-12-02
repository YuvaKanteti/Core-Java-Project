package com.excelr.java.multithreading;

public class MyThreadex extends Thread {
	
	public void run() {
		System.out.println("This thread is running");
	}
	public static void main(String[] args) {
		MyThreadex th = new MyThreadex();
		MyThreadex th1 = new MyThreadex();
		th.start();
		th1.start();
		
	}

}
