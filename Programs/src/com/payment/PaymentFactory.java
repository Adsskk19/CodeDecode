package com.payment;

public class PaymentFactory {
	
	public static Payment getPayment(String type) {
		if(type.equalsIgnoreCase("creditcard")) {
			return new CreditCardPayment();
		}
		else {
			return new UpiPayment();
		}
		
	}

}
