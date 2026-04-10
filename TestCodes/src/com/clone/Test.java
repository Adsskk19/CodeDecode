package com.clone;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Student st = new Student(1,"kiran",new Address("Ankam vari Street",533255l));
		Object clonedSt = (Student)st.clone();
		
		System.out.println(st);
		System.out.println(clonedSt);
		
		System.out.println("---------------------------------");
		st.setName("Pandu");
		st.getAddress().setStreet("3rd Ward Ankam vari Street");
//		st.setAddress(new Address("3rd Ward Ankam vari Street",533255)); it is creating new object in different ref address
		System.out.println(st);
		System.out.println(clonedSt);
		//user defined Object was updated but Not Primitive data type and String class.
		
		
	}

}
