package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clarity {
	public static void main(String[] args) {
		List <String> fruits = new ArrayList<> ();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		
		Iterator<String> it =fruits.iterator();
		
		while(it.hasNext()) {
			String fruit = it.next();
			System.out.println(fruit);
			if(fruit.equals("orange")) {
				it.remove();
			}
		}
		System.out.println(fruits);
	}

}
