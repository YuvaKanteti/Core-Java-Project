package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
	public static void main(String[] args) {
		Map <Integer, String> employee = new  HashMap<>();
		employee.put(1, "yuva");
		employee.put(2, "vasu");
		employee.put(3, "prakash");
        employee.put(4, "khyati");
        System.out.println(employee);
        System.out.println(employee.get(2));
        employee.remove(4);
        System.out.println(employee);
        //itration
        //entryset
        System.out.println(employee.get("yuva"));
        
        for(Map.Entry<Integer, String> entry : employee.entrySet()) {
        	System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        for(Integer key : employee.keySet()) {
        	System.out.println(key+"->"+employee.get(key));
        }
        employee.forEach((a,b)->System.out.println(a+"->"+b));
        System.out.println(employee.containsKey(2));
        System.out.println(employee.containsValue("yuva"));
        
        List<String> arrlist = new ArrayList<>();
		arrlist.add("apple");
		arrlist.add("umbrella");
		arrlist.add("book");
		arrlist.add("umbrella");
		arrlist.add("book");
		arrlist.add("book");
		arrlist.add(2,"orange");
		
		Map <String,Integer> frequencyMap = new HashMap<>();
		
		
		for (String fruit : arrlist) { 
			if (frequencyMap.containsKey(fruit)) { 
				frequencyMap.put(fruit, frequencyMap.get(fruit) + 1); 
				} 
			else { frequencyMap.put(fruit, 1); 
			} 
			}
		System.out.println(frequencyMap);

	}

}
