package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {
	public static void main(String[] args) {
		
		//Convert Strings to Uppercase and Sort Alphabetically
		
		List<String> Strings = Arrays.asList("Ayuva","prakash","Asrinivas","yuva","yuva");
		
		List <String> uppersorted = Strings
				                     .stream()
				                     .map(n->n.toUpperCase())
				                     .sorted()
				                     .collect(Collectors.toList());
				                     
				                     System.out.println(uppersorted);

	}

}
