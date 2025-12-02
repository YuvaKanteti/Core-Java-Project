package com.excelr.java.multithreading;

//extending thread class
	class MyThread extends Thread{
		public void run() {
			System.out.println("Thread1 is running....");
		}
		
	}
	
	class MyThread2 extends Thread{
		public void run() {
			System.out.println("Thread2 is running....");
		}
		public void add() {
			System.out.println("it is add");
		}
		
	}
	class MyRunnable implements Runnable{
		public void run() {
			System.out.println("Rnnable Thread is running....");
		}
	}
	
    
public class CreatingAThread {
	
	
	public static void main(String[] args) {
		
		
		MyThread t1 = new MyThread();
		t1.start();
		MyThread2 t3 = new MyThread2() ;
		t3.start();
		t3.setPriority(8);
		
		
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
		
	}

	

}
