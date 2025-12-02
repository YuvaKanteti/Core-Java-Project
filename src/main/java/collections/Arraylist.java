package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<>();
		arrlist.add("apple");
		arrlist.add("umbrella");
		arrlist.add("book");
		arrlist.add(2,"orange");
		arrlist.remove(2);
		arrlist.remove("book");
		arrlist.addAll(Arrays.asList("pineapple","fruits"));
		String s= arrlist.get(3);
		arrlist.set(2,"pencil");
		System.out.println(arrlist.contains("book"));
		System.out.println(arrlist.size());
		System.out.println(arrlist.indexOf("apple"));
		System.out.println(s);
		System.out.println(arrlist);
		for(String fruit : arrlist) {
			System.out.println(fruit+" ");
			//cannot modify the list in loop
		}
		System.out.println("--------iterator--------");
		Iterator <String> it = arrlist.iterator();
		while(it.hasNext()){
			String fruit = it.next();
			System.out.println(fruit);
			if(fruit.equals("apple")) {
				it.remove();
			}
		}
		System.out.println("--------ListIterator--------");
		ListIterator<String> listit = arrlist.listIterator();
		System.out.println(arrlist);
		List<Integer> arrlist1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		arrlist1.add(20);
		System.out.println(arrlist1);
		 
		List<Object> arrlist2 = Arrays.asList(1,"String",4,5);
		
		System.out.println(arrlist2);
		//ordered frequent
	}
	

}
