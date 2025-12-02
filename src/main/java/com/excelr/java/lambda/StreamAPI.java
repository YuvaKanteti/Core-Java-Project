package com.excelr.java.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List <Integer> numbers = Arrays.asList(4,3,5,6,8,34,3,3,6,8,9);
		
		System.out.println("original list : "+numbers);
		
		List <Integer> evennumbers = numbers.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(evennumbers);
		
		List <String> stringNumber = numbers.stream().map(n->"Numbers : "+n).collect(Collectors.toList());
		System.out.println(stringNumber);
		
		List <Integer> sortedlist = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
				
		List <Integer> distinctlist = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(distinctlist);
		
		List <Integer> firstthreeelements = numbers.stream().limit(4).collect(Collectors.toList());
		System.out.println(firstthreeelements);	
		
		List<Integer> skipnumbers = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println(skipnumbers);
		
		//peek - print each element
		numbers.stream().peek(n->System.out.println("peeked number : "+n)).collect(Collectors.toList());
		
		numbers.stream().forEach(n->System.out.println(n*n));
		
		long count = numbers.stream().count();
		System.out.println("count of the elements : "+count);
		
		boolean anyEvenNumber = numbers.stream().anyMatch(n->n%2==0);
		System.out.println(anyEvenNumber);
		
		boolean allEvenNumbers = numbers.stream().allMatch(n->n%2==0);
		System.out.println(allEvenNumbers);
		
		boolean noneNegativeNumber = numbers.stream().noneMatch(n->n<0);
		System.out.println(noneNegativeNumber);
		
		Integer a = numbers.stream().findFirst().orElse(null);
		System.out.println(a);
		
		Integer anynumber = numbers.stream().findAny().orElse(null);
		System.out.println(anynumber);
		
		Integer sum = numbers.stream().reduce(0,Integer::sum);
		System.out.println("sum of the number : "+sum);
	
	}

}
