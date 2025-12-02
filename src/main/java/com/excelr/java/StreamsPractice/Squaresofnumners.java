package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Squaresofnumners {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,2,3,3,4,4,5,5);
		
		Set <Integer> squares = numbers.stream().map(n->n*n).collect(Collectors.toSet());
		System.out.println(squares);

	}

}
