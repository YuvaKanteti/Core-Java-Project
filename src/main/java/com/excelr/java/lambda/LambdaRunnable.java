package com.excelr.java.lambda;

public class LambdaRunnable {
	public static void main(String[] args) {
		   Runnable task = ()-> {
	            System.out.println("Thread is running using Lambda!");
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Count: " + i);
	                try {
	                    Thread.sleep(500); // sleep for 500ms
	                } catch (InterruptedException e) {
	                    System.out.println("Thread interrupted.");
	                }
	            }
	        };

	        // ✅ Start the thread
	        
	        new Thread(task).start();
	    }
	}


