package com.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	
	public static void main(String[] args) {
//		secondLargeNum();
//		removeOccurences();
//		Dog dog = new Dog();
//		dog.eat();
//		dog.bark();
		
//		addition(45, 78);
//		addition(23, 56, 8.4567);
		
		isPrimeNumber(8);
		System.out.println("-----------------------------------");
		sumOfArrayElements();
		System.out.println("-----------------------------------");
		hasVowelInString();
		System.out.println("-----------------------------------");
		binarySearchCheck();
		System.out.println("-----------------------------------");
		hashMapSort();
		System.out.println("-----------------------------------");
		immutabilityCheck();
		System.out.println("-----------------------------------");
		trycatchExample();
		System.out.println("-----------------------------------");
		funcationaInterfaceCheck();
		System.out.println("-----------------------------------");
		removeDuplicates();
		System.out.println("-----------------------------------");
		swapArrayElements();
		System.out.println("-----------------------------------");
		checkDigitsInString();
		
	}


	
	//11. How would you find the second largest number in an array?
	private static void secondLargeNum() {
		int [] arr1 = {5,6,8,7,9};
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1-i;j++) {
				if(arr1[j]>arr1[j+1]) {
					int temp = arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		int secondLargestNumber = arr1[arr1.length-2];
		System.out.println("secondLargestNumber: "+secondLargestNumber);
	}
	
	//12. How do you remove all occurrences of a given character from the input string?
	private static void removeOccurences() {
		String str = "Hello World";
		char c= 'o';
		String result ="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				result+=str.charAt(i);
			}
		}
		System.out.println("Result: "+result);
	}
	//14. Explain overloading and overriding with the help of a program?
	
	public static void addition(int a, int b) {
		int res = a+b;
		System.out.println("Addition is: "+ res);
		
	}
	public static void addition(int a, int b, double c) {
		double res = a+b+c;
		System.out.println("Addition of 3 numbers: "+res);
	}
	
	//15. How do you check if the given number is prime?
	
	public static void isPrimeNumber(int num) {
		int count =0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count ==0) {
			System.out.println("Given number: "+num+ " is Prime");
		}else {
			System.out.println("Given number: "+num+ " is Not Prime");
		}
		
	}

	// 16. How do you sum all the elements in an array?
	public static void sumOfArrayElements() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
//		for(int i =0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
		for (int num : arr) {
			sum += num;
		}
		System.out.println("Sum of Array elements is: " + sum);
	}
	
	//17. Write a Java program to check if a vowel is present in a String
	public static void hasVowelInString(){
		String str ="hello Java";
		boolean hasVowel = false;
		
		for(int i=0;i<str.length();i++) {
			
		
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				hasVowel = true;
				break;
			}
		}
		
		System.out.println("Is String has Vowels: "+hasVowel);
		
		
		
	}
	
	//18. How do you implement a binary search in Java?
	private static void binarySearchCheck() {
		int [] arr = {5,6,8,0,3,2,4};
		int target = 2;
		int result = binarySearch(arr, target);
		if(result!=-1) {
			System.out.println("Element found in Index: "+result);
		}else {
			System.out.println("Element Not found!");
		}
	}
	public static int binarySearch(int [] arr,int key) {
		int left =0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]<key){
				left = mid+1;   //previously left: 0 now left: 4
			}
			else {
				right = mid -1;
			}
		}
		return -1;
	}
	
	//19. Write a Java program that sorts HashMap by value
	static void hashMapSort(){
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		list.sort(Map.Entry.comparingByValue());
		
		System.out.println("Sorted Hashmap by Value: ");
		for(Map.Entry<String, Integer> entry: list) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	//20. Can you prove that a String object in Java is immutable programmatically?
	static void immutabilityCheck() {
		String str1 ="Hello";
		String str2 = str1;
		 str1 = str1 +"World";
		 System.out.println("Str1 : "+str1);
		 System.out.println("Str2 : "+str2);
		 if(!str1.equals(str2)) {
			 System.out.println("String are Immutable!");
		 }
	}
	
	//21. How do you illustrate a try-catch example in Java?
	static void trycatchExample(){
		try {
			int res =10/0;
			System.out.println(res);
		}
		catch(Exception e){
			System.out.println("Arthmetic exception caught: "+e.getMessage());
		}

	}
	
	//22. How do you create a functional interface?
	static void funcationaInterfaceCheck() {
		MyFunctionalInterface myFunc = ()-> System.out.println("Executing functional interface method");
		myFunc.execute();
		
	}
	
	//23. Write a program to remove duplicate elements from an array in Java.
	static void removeDuplicates(){
		int [] arr = {1,2,2,3,4,4,5,6};
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		int [] uniqueArr = new int[set.size()];
		int i =0;
		for(int num : set) {
			uniqueArr[i++] = num;
		}
		System.out.println("Array without duplicates: "+Arrays.toString(uniqueArr));
	}
	
	//24. How do you swap the first and last elements of an array in Java?
	static void swapArrayElements(){
		int [] arr = {3,4,5,6,7,8};
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		System.out.println("Swapped Array is: "+ Arrays.toString(arr));
		for(int num: arr) {
			System.out.print(num+" ");
		}
		
		
	}
	//25. How do you check if a string contains only digits in Java?
	static void checkDigitsInString(){
		String str = "Sai123";
		boolean isNumeric = false;
		for(int i =0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				isNumeric=true;
				System.out.println("Yes this string contains digits!");
				break;
			}
		}
		System.out.println("is this string contains digits: "+isNumeric);
	}
	
	
	
	
}

