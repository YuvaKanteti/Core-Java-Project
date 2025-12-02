package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareandRemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,2,3,3,4,4,5,5);
		
		List <Integer> uniqueSquarenumbers = numbers
				.stream()
				.distinct()
				.map(n->n*n)
				.collect(Collectors.toList());
		System.out.println(uniqueSquarenumbers);
				
	}

}
