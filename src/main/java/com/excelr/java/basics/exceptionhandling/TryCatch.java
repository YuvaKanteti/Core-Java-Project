package com.excelr.java.basics.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
	
		  
	
	    static void readFile() throws FileNotFoundException  {  // ❌ No throws, but causes a checked exception
	        FileReader file = new FileReader("test.txt"); // Compilation error!
	    }

	    public static void main(String[] args) {
	    	 try {
	             readFile();  // ✅ Now we must handle it here
	         } catch (IOException e) {
	             System.out.println("Exception caught: " + e.getMessage());
	         }	    }
	}
	        
	    
	


