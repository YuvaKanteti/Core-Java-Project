package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Setexample {
	public static void main(String[] args) {
		Set <String> animals = new HashSet<>(Arrays.asList("Lion","tiger","girrafee","tiger"));
		System.out.println(animals);
		animals.remove("tiger");
		System.out.println(animals.contains("tiger"));
		System.out.println(animals);		
		// for
		for(String animal : animals) {
			System.out.println(animal);
		}
		// Iteration
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a);
		}
		//foreach
		
		animals.forEach(animal->System.out.println(animal));
		System.out.println(animals.isEmpty());
		
		Set <Integer> numbers = new TreeSet<>(Arrays.asList(1,6,3,4,7,90,234,8,5));
		System.out.println(numbers);
	}

}
