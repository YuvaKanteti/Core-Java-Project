package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfIntegers {
	public static void main(String[] args) {
	    List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8);
	    
	    long a = li.stream().filter(n->n%2==0).mapToLong(n->n).sum();
	    System.out.println(a);
	
	}

}
