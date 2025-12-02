package com.excelr.java.StreamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
	public static void main(String[] args) {
		List <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		Integer sum = numbers.stream().collect(Collectors.summingInt(n->n));
		System.out.println(sum);
		
		int sum1 = numbers.stream().mapToInt(n->n).sum();
		System.out.println(sum);
		
		Integer evennumbers = numbers.stream().filter(n->(n%2==0)).collect(Collectors.summingInt(n->n)); 
		System.out.println(evennumbers);
	}

}
