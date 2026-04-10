package com.payment;


//Design a payment system where the user can choose different payment methods such as Credit Card, UPI, and PayPal.
//Each payment method processes payments in its own way. 
//Use the Factory Design Pattern to create the correct payment object based on the user’s choice.

public class User {
	
	public static void main(String[] args) {
		
		Payment payment = PaymentFactory.getPayment("paypal");
		payment.pay(1000.00);
		
	}

}
