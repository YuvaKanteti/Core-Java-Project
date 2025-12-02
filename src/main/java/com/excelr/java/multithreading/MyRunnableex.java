package com.excelr.java.multithreading;

public class MyRunnableex implements Runnable {
	public void run() {
		System.out.println("this thread is running");
	}
	public static void main(String[] args) {
		Thread mr = new Thread(new MyRunnableex());
		mr.run();
	}

}
