package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Demo2 {
	public static void main(String[] args) {

		// calculate Count of even nums in a list using streams or java 8
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 12, 56, 78, 46));
		long count = nums.stream().filter((n) -> n % 2 == 0).count();
		System.out.println(count);

		// calculate sum of evens in a list using streams or java 8
		int sum = nums.stream().filter((n) -> n % 2 == 0).mapToInt(n -> n).sum();
		System.out.println(sum);

		/*
		 * See Collection work with classes here we filtered elements but they are
		 * Integer type not int hence we converted in to int by using .mapToInt and then
		 * .sum method will work and give sum value
		 */

		// fivemultiples in the list
		long fivemultiples = nums.stream().filter((n) -> n % 5 == 0).count();
		System.out.println(fivemultiples);

		// average
		double asDouble = nums.stream().mapToInt(n -> n).average().getAsDouble();
		System.out.println(asDouble);

		OptionalDouble average = nums.stream().mapToInt(n -> n).average();
		System.out.println(average); // it print optional double
		System.out.println(average.getAsDouble()); // print actual double value

		// flatmap in streams
		List<List<String>> nestedList = new ArrayList<List<String>>();
		nestedList.add(Arrays.asList("hi", "hello"));
		nestedList.add(Arrays.asList("bye", "see you"));
		nestedList.add(Arrays.asList("GM", "GN"));
		nestedList.add(Arrays.asList("hifi", "thumbs up"));
		// one list contained four list
		System.out.println(nestedList);
		// we apply streams on this

		List<String> list2 = nestedList.stream().flatMap(list -> list.stream()).toList();
		System.out.println(list2);

		ArrayList<Integer> numslist = new ArrayList<Integer>(Arrays.asList(12, 17, 67, 56, 56, 78, 46));
		numslist.stream().forEach((n) -> System.out.println(n));
		System.out.println(); // Order maintained
		System.out.println("-----------------------------------");
		numslist.parallelStream().forEach((n) -> System.out.println(n)); // No-order

	}

}
