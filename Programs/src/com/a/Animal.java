//13. Showcase Inheritance with the help of a program?
package com.a;

public class Animal {
	
	void eat() {
		System.out.println("Animals can eat ");
	}

}

class Dog extends Animal{
	
	//Overrided method
	void eat() {
		System.out.println("Dog eats chicken often usually!");
	}
	
	void bark() {
		System.out.println("Dog is barking ");
	}
}