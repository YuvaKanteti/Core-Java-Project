package collections;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<>();
		arrlist.add("apple");
		arrlist.add("umbrella");
		arrlist.add("book");
		arrlist.add(2,"orange");
		System.out.println(arrlist);
		for(int i=arrlist.size()-1;i>=0;i--) {
			System.out.println(arrlist.get(i));
		}
	}

}
