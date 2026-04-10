package com.payment;

public class CreditCardPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Paid via Credit Card"+amount);
		
	}

}

class UpiPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Paid via Upi "+amount);
		
	}
	
}










