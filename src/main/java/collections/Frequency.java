package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		List <String> school = new ArrayList<>(Arrays.asList("bag","bag","pencil","eraser","eraser","eraser"));
		
		Map <String , Integer> frequencyMap = new HashMap<>();
		
		for(String things : school) {
			if(frequencyMap.containsKey(things)) {
				frequencyMap.put(things, frequencyMap.get(things)+1);
			}
			else
				frequencyMap.put(things,1);
		}
		System.out.println(frequencyMap);
		
	}

}
