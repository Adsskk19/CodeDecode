package com.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("apple","banana","apple","papaya","carrot","papaya"));
		Map<String, Long> fruitCollection = fruits.
		stream()
		.sorted()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(fruitCollection);
		
		String fruit = "Apple";
		Map<Character, Long> charFreq = fruit
		.chars() //String in to chars but in ASCII values
		.mapToObj(c->(char)c)  //typecasted ASCII values in to char
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charFreq);
		
		
		int [] arr = {2,3,45,6,7};
		
		int sum = Arrays
		.stream(arr)
		.sum();
		System.out.println(sum);
		
		long oddCount = Arrays.stream(arr)
		.filter(n->!(n%2==0))
		.count();
		System.out.println(oddCount);
		
		
	}

}
