package com.excelr.java.collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"Apple");
		map.put(2,"Banana");
		System.out.println(map);
		Collection<String> values = map.values();
		System.out.println(values);
		System.out.println(map.get(2));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Banana"));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
	}

}
