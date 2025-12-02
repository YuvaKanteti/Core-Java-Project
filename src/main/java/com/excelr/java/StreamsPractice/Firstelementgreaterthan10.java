package com.excelr.java.StreamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Firstelementgreaterthan10 {
	public static void main(String[] args) {
		
		
			List <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,42,5,6,73,8,91));
			
			int n = numbers.stream().filter(a->a>10).findFirst().orElse(-1);
			System.out.println(n);
		
	}

}
