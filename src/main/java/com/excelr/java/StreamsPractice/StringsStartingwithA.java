package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringsStartingwithA {
	public static void main(String[] args) {
List<String> Strings = Arrays.asList("Ayuva","prakash","Asrinivas","yuva","yuva");
		
		long count = Strings.stream()
				.filter(s->s.startsWith("A"))
				.count();
		System.out.println(count);
	}

}
