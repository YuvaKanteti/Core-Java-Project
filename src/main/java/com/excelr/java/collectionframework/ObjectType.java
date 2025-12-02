package com.excelr.java.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ObjectType {
	public static void main(String[] args) {
		List<Object> objlist = new ArrayList<>();
		objlist.add("yuva");
		objlist.add(23);
		objlist.add("TCS");
		objlist.add('F');
		objlist.add(23500.90);
		System.out.println(objlist);
		System.out.println(objlist.get(2));
		System.out.println((int) objlist.get(1));
	}

}
