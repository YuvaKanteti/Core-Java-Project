package com.excelr.java.collectionframework;

import java.util.HashSet;

public class Practice {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
	    System.out.println(hs);

		System.out.println(hs.remove(30));
	    System.out.println(hs);

		System.out.println(hs.contains(10));
	    System.out.println(hs);

		
		for(int integer : hs) {
			System.out.println(integer);
		}

	   
	}

}
