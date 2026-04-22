package com.singleton;

public class Single {
	private static Single obj;
	private Single() {
		
	}
	
	private static Single getSingletonClass() {
		if(obj==null) {
			obj = new Single();
		}
		return obj;
		
		
		
	}
	

}
