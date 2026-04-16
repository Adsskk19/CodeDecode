package com.walkin;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		
		//Generate unique words from a list of sentences using flatMap + split "Java is Powerful"
		//Create a custom collector concatinating the string with delimeter
		// Generate an array of even and odd sums op: [10,15,20,25,30];
		
		List<String> sentences = Arrays.asList("Java is Powerful","Java is Easy","Streams are Crazy!");
		
		Set<String> uniquewords = sentences
		.stream()
		.flatMap(s->Arrays.stream(s.split(" ")))
		.map(e->e.toLowerCase())
		.collect(Collectors.toSet());
		System.out.println(uniquewords);
		
		
		
		
		
	}

}
