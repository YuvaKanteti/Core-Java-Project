package com.excelr.java.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("apple");
		list.add("Banana");
		list.add("Dog");
		list.add("carrot");
		System.out.println(list);
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add("carrot");
		}
		
		System.out.println(list);
	}

}
