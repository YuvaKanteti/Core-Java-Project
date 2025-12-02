package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListChallange {
	public static void main(String[] args) {
		List <Integer> li = new ArrayList<> ();
		li.add(1);
		li.add(4);
		li.add(5);
		li.forEach(num->System.out.println(num));
		li.remove(0);
		System.out.println(li);
		Iterator <Integer> it = li.iterator();
		while(it.hasNext()) {
			Integer num1 = it.next();
			System.out.println(num1);
			if(it.next().equals(5)) {
				it.remove();
			}
		}
		System.out.println(li);
		li.set(0, 7);
		System.out.println(li);
		System.out.println(li.contains(7));
		ListIterator <Integer> listli = li.listIterator();
		while(it.hasNext()) {
			Integer num2 = it.next();
			System.out.println(num2);
			if(num2.equals(7)) {
				listli.add(9);				
			}
		}
	}

}
