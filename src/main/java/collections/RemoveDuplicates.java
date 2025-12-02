package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<>();
		arrlist.add("apple");
		arrlist.add("umbrella");
		arrlist.add("book");
		arrlist.add(2,"orange");
		arrlist.add("umbrella");
		
		
		List <String> unique = new ArrayList<>();
		
		for( String fruit : arrlist) {
			System.out.println(fruit);
			if(!unique.contains(fruit)) {
				unique.add(fruit);
			}
		}
		System.out.println(unique);
		
	}

}
