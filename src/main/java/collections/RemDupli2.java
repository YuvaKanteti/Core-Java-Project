package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemDupli2 {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<>();
		arrlist.add("apple");
		arrlist.add("umbrella");
		arrlist.add("book");
		arrlist.add(2,"orange");
		arrlist.add("umbrella");
		System.out.println(arrlist);
		Set <String> s = new LinkedHashSet(arrlist); 
		System.out.println(s);
		
		List<String> unique = new ArrayList<>(s);
		System.out.println(unique);
	
	}

}
