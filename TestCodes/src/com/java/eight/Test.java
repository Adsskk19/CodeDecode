package com.java.eight;

public class Test implements FunctInterfaces,InterfaceTwo{
	public static void main(String[] args) {
		Test test = new Test();
		test.hiKiran();
		String hello = test.hello();
		System.out.println(hello);
	}

	@Override
	public void hiKiran() {
		System.out.println("Hi Kiran.....");
	}

	@Override
	public String hello() {
		return "Helloo";
	}

}
