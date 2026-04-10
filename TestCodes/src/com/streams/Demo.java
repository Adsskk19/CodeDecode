package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 10, 10, 21, 2, 45, 13, 14, 17, 45));
//		List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).distinct()
//				.collect(Collectors.toList());
//		System.out.println(sortedList);
//
//		Integer maxNumber = list.stream().sorted(Comparator.reverseOrder()).distinct()
//					.findFirst().get();
//		System.out.println(maxNumber);
//		Integer secondMaxNumber = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
//		System.out.println(secondMaxNumber);
		
		
		
/*Streams in Maps*/	
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "Rama");
		hashMap.put(2, "lakshman");
		hashMap.put(3, "Bharat");	
		hashMap.put(4, "Shatrugna");
		
//		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//			System.out.println(entry.getKey() + ":"+ entry.getValue());
//		}
//		for(Integer key :hashMap.keySet()) {
//			System.out.println(key+" : "+ hashMap.get(key));
//		}

//		hashMap
//		.entrySet()
//		.stream()
//		.forEach((entry)->System.out.println(entry.getKey() +" : "+ entry.getValue()) );
//		
//		
//		List<Entry<Integer, String>> collection = hashMap
//		.entrySet()
//		.stream()
//		.filter((e)->e.getKey()>=2)
//		.collect(Collectors.toList());
//
//		System.out.println(collection);
		//But above data Type is Entry Type we want it as Map type
		
		//print key-value of pairs value >=2 int a map.
	Map<Integer, String> filteredMap = hashMap
		.entrySet()
		.stream()
		.filter((e)->e.getKey()>=2)
		.collect(Collectors.toMap((e)->e.getKey(), (e)->e.getValue()));

		System.out.println(filteredMap);
		
		//print keys of same course
		
		HashMap<String, String> courses = new HashMap<String,String>();
		courses.put("Option1", "Course1");
		courses.put("Option2", "Course1");
		courses.put("Option3", "Course3");
		courses.put("Option4", "Course1");
		
//		System.out.println(courses);
		List<Entry<String, String>> keysList = courses.entrySet()
		.stream()
		.filter((e)->e.getValue()=="Course1")
		.toList();
//		System.out.println(keysList);
		
		
		//but we are getting key value pairs
		//we need keys only
		List<String>keysList1 = courses.entrySet()
		.stream()
		.filter((e)->e.getValue().equals("Course1"))
		.map(e->e.getKey())
		.toList();
		System.out.println(keysList1);
		
		//we need to get Map type only with key value pairs
		//Collection if K-V pairs of Map Type.
		Map<String, String> collection = courses.entrySet()
		.stream()
		.filter((e)->e.getValue().equals("Course1"))
		.collect(Collectors.toMap((e)->e.getKey(), (e)->e.getValue()));
		System.out.println(collection);
		
	
		
		
		
		
		

	}

}
