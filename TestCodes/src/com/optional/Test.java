package com.optional;

import java.util.Optional;


public class Test {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10,"Kiran");
		Employee emp2 = new Employee(11,"bharat");
		Employee emp3 = new Employee(12,null);
		
		Optional<String> empNameById = emp1.getEmpNameById(12);
		empNameById.ifPresentOrElse( e -> System.out.println(e) ,()->System.out.println("No value!") );
		
//		System.out.println(empNameById.get());
		
//		new Optional<String>("Java");
		
		Optional<Object> empty = Optional.empty(); //empty Object
//		System.out.println(empty.get());
		
		Optional<Object> ofNullable = Optional.ofNullable(null);
		ofNullable.ifPresentOrElse(e -> System.out.println(e), ()->System.out.println("Null value"));
		
		
		Optional<String> obj = Optional.of("Kiran"); //to store a value in Optional Object
		System.out.println(obj.get());
		
		
		
		
		
		
		
		
		
		
	}



}
