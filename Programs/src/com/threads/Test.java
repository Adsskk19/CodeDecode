package com.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// [4, 5, 1, 2, 0, 4, 1, 2] second non repeated digit

		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(4, 5, 1, 2, 0, 4, 1, 2));

		Map<Integer, Long> collect = arrayList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);

		List<Entry<Integer, Long>> list = collect.entrySet().stream().filter(e -> e.getValue() == 1).skip(1).toList();
		System.out.println(list);

	}

}
