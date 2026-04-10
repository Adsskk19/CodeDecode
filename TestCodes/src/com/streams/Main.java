package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// character frequency using streams
		System.out.println("character frequency");
		String str = "JavaStreams";
		Map<Character, Long> frequency = str.chars().mapToObj(n -> (char) n)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println(frequency);
	
		System.out.println("Q1:");
		// 1. Count characters in a string Output: Input: "banana" {b=1, a=3, n=2}
		String input = "banana";
		Map<Character, Long> output = input.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(output);
		
		System.out.println("Q2:");
		// 2. Find even numbers from a list
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumsList = nums.stream().filter(e -> e % 2 == 0).toList();
		System.out.println(evenNumsList);
		
		System.out.println("Q3:");
		// 3. Convert list of strings to uppercase
		List<String> strList = new ArrayList<String>(Arrays.asList("java", "stream"));
		String upperCase = strList.toString().toUpperCase();
		System.out.println(upperCase);
		
		System.out.println("Q4:");
		// 4. Find length of each string
		List<String> lenList = new ArrayList<String>(Arrays.asList("apple", "bat"));
		lenList.stream().forEach(e -> System.out.println(e.length()));
//		System.out.println(lenList); forEach(e-> System.out.println(e.length()));
		System.out.println("Q5:");
		
		// 5. Remove duplicates from list
		List<Integer> numList = Arrays.asList(1, 2, 2, 3, 4, 4);
		numList.stream().distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		System.out.println("Q6:");
		// 6. Count frequency of elements in a list
		List<Integer> numList1 = Arrays.asList(1, 2, 2, 3, 4, 4);
		Map<Integer, Long> numsfreq = numList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(numsfreq);
		System.out.println("Q7:");
		// 7. Find first non-repeated character in a string
		String str3 = "stress";
		Character character = str3.chars().mapToObj(c -> (char) c) // ()->new LinkedHashMap<>()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println("First Non Repeated Char: " + character );
		// 8. Sort a list of strings by length
		System.out.println("Q7:");
		List<String> sortList = new ArrayList<String>(Arrays.asList("java", "a", "stream"));
//		sortList.stream()
//		.sorted(Comparator(n->n.length));
		// 9. Find max and min number in list
		System.out.println("Q9:");
		List<Integer> numbers = Arrays.asList(34, 12, 24, 56, 78, 90);
		Integer minValue = numbers.stream().sorted().findFirst().get();
		System.out.println("Min Value: " + minValue);
		Integer maxValue = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("Max Value: " + maxValue);
		// 10. Join list of strings with comma ["A","B","C"]
		System.out.println("Q10:");
		List<String> stringsList = Arrays.asList("A", "B", "C");
		String res = stringsList.stream().collect(Collectors.joining(","));
		System.out.println(res);
		// 11. Group strings by length
		System.out.println("Q11:");
		List<String> words = Arrays.asList("apple", "bat", "sat", "banana", "cat", "dog", "kiwi");
		Map<Integer,List<String>> collect = words.stream()
		.collect(Collectors.groupingBy(e->e.length()));
		System.out.println(collect);
		Map<Integer,Long> collect2 = words.stream()
		.collect(Collectors.groupingBy(String::length,Collectors.counting()));
		System.out.println(collect2);
		// 12. Partition numbers into even & odd Hint: partitioningBy
		System.out.println("Q12:");
		   List<Integer> nums1 = Arrays.asList(1,2,3,4,5,6,7,8);
		   Map<Boolean, List<Integer>> collect3 = nums1
		   .stream()
		   .collect(Collectors.partitioningBy(n->n%2==0));
		   
		   System.out.println("Even nums list: "+collect3.get(true));
		   System.out.println("Odd nums list: "+collect3.get(false));
		   
		//13. Find 2nd highest number in a list
			System.out.println("Q13:");
		 Integer secMax = nums1.stream()
		   .sorted(Comparator.reverseOrder())
		   .skip(1)
		   .findFirst()
		   .get();
		 System.out.println(secMax);
		 //14. Find duplicate elements in a list [1,2,3,2,4,1]
			System.out.println("Q14:");
			   List<Integer> nums2 = Arrays.asList(1,2,3,2,4,1);
			Map<Integer,Long> collect4 = nums2.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			Set<Integer> dupList = collect4.entrySet()
			.stream()
			.filter(e->e.getValue()>1)
			.map(e->e.getKey())
			.collect(Collectors.toSet());
			System.out.println("duplicate elements:"+dupList);
			
		//15. Find top 3 highest numbers
			System.out.println("Q15:");
			List<Integer> nums3 = Arrays.asList(34, 12, 24, 56, 78, 90);
		List<Integer> topThree = nums3
			.stream()
			.distinct()
			.sorted(Comparator.reverseOrder())
			.limit(3)
			.collect(Collectors.toList());
			System.out.println(topThree);
			
		//16. Convert List → Map ["apple", "bat"] Key = string, Value = length
			System.out.println("Q16:");
			List<String> valList = Arrays.asList("apple", "bat");
			Map<String,Integer> lismap = valList
			.stream()
			.collect(Collectors.toMap(e->e,e->e.length()));
			System.out.println(lismap);
		//17. Flatten a list of lists	[[1,2],[3,4]]  Output: [1,2,3,4]
			System.out.println("Q17:");
			List<List<Integer>> nestList =  Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
			List<Integer> flatenedList = nestList
			.stream()
			.flatMap(x->x.stream())
			.collect(Collectors.toList());
			System.out.println("flatenedList: "+flatenedList);
			
		//18. Find longest string in a list in streams
			System.out.println("Q18:");
			  List<String> fruitList = Arrays.asList("apple", "banana", "cat");
			  String longest = fruitList 
			  .stream()
			  .max(Comparator.comparing(e->e.length()))
			  .orElse(null);
			  System.out.println(longest);
		//19: Check if all elements match a condition Example: all numbers > 0	
				System.out.println("Q19:");
			  List<Integer> nums4 = Arrays.asList(12, 24, 56, 78, 90);
			  boolean op = nums4.stream()
			  .anyMatch(e->e>0);
			  System.out.println(op);
			  
		//20. Find sum of squares of even numbers
			  System.out.println("Q20:");
			    List<Integer> nums5 = Arrays.asList(1, 2, 3, 4, 5);
			    int sum = nums5.stream()
			    .filter(e->e%2==0)
			    .mapToInt(n->n*n)
			    .sum();
			    System.out.println(sum);
//TCS 2	//Two arrays arr1 = [4,2,3,1]; arr2 = [4,5,6]; Remove duplicates and merge two arrays in to one sorted array
			  System.out.println("QLast:");
			int [] arr1 = {4,2,3,1};
			int [] arr2 = {4,5,6};
			int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
			.distinct()
			.sorted()
			.toArray();
			System.out.println("Sorted Array: "+Arrays.toString(result));
			
			
			/*Real Interview-Level Questions
21. Find first repeated character in string

 "programming" → 'r'

22. Group employees by department

(Custom object question)

23. Sort employees by salary (descending)
24. Find highest paid employee per department
25. Count occurrences of each word in a sentence

👉 "java is java"*/
			
			   
			   
			

	}

}
