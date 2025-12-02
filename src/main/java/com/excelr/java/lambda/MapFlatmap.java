package com.excelr.java.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatmap {
	public static void main(String[] args) {
		
		List<List<String>> listoflist = Arrays.asList(
				Arrays.asList("varun","Alia","Sid"),
				Arrays.asList("Amithab","Aishwarya"),
				Arrays.asList("Ranbir","Ranvir","Deppika","Kiara")
				);
		
		List <Integer> sizeofindividual = listoflist.stream().map(List::size).collect(Collectors.toList());
		System.out.println(sizeofindividual);
		
		List <String> alllist = listoflist.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(alllist);
	}

}
