package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 2, 45, 67, 78, 17, 68, 34,2,45));
//		list.forEach((num) -> System.out.println(num)); // Takes consumer interface
//		list.stream().filter((n) -> n % 2 == 0).forEach((n) -> System.out.println(n));

//		List<Integer> filteredList = list.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
//		System.out.println(filteredList);
//		Set<Integer> filteredSet = list.stream().filter((n) -> n % 2 == 0).collect(Collectors.toSet());
		
		List<Employee> employees = new ArrayList<Employee>();
				employees.add(new Employee(1, "Fayaz", 1000));
				employees.add(new Employee (2, "Ramu", 110000));
				employees.add(new Employee (3, "Upendar", 99999));
				employees.add(new Employee(4, "Vijay", 350000));
				
				List<Employee> salList = employees
				.stream()
				.filter((e)->e.getSalary()>=100000)
				.toList();
				System.out.println();
//				System.out.println(salList);
				
				//(emp1, emp2) -> Integer.compare(emp1.getSalary(),emp2.getSalary())
				List<Employee> sortedList = employees
				.stream()
				.sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(),emp2.getSalary()))
				.toList();
				
				System.out.println(sortedList);
				List<Employee> sortedRevList = employees
						.stream()
//						.sorted((emp1, emp2) -> Integer.compare(emp2.getSalary(),emp1.getSalary()))
						.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
						.toList();
						System.out.println(sortedRevList);


	}

}
