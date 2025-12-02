package com.excelr.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		System.out.println(list);
		
		List<Float> list1 = new ArrayList<>();
		list1.add((float) 10.0);
		list1.add(29.0f);
		list1.add(30.0f);
		System.out.println(list1);
		list1.set(1,40.0f);
		
		System.out.println(list1);
		list1.remove(1);
		list.remove("Python");
		System.out.println(list);
		System.out.println(list1);
		
		System.out.println(list.size());
		 Collections.sort(list);
		 Collections.sort(list1);

		System.out.println(list1);

	}

}
