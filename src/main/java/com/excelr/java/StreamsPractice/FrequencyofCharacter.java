package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyofCharacter {
	public static void main(String[] args) {
		List<String> Strings = Arrays.asList("yuva","prakash","srinivas","yuva","yuva");
		
		Map <String, Long> stringfreq = Strings.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(stringfreq);
	}

}
