package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicatepractice {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,3,4,3,5,76,8,9,6,5);
		
		Set<Integer> duplicates = numbers.stream().filter(n->Collections.frequency(numbers,n)>1).collect(Collectors.toSet());
		System.out.println(duplicates);

	}
	
	

}
