package com.optional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeclass {
	public static void main(String[] args) {
		
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate yest = LocalDate.of(2026,03,12);
		System.out.println(yest);
	
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfYear());
		
		
		LocalDate date2 = LocalDate.parse("2025-08-19");
		System.out.println(date2);
		System.out.println(date2.getYear());
		System.out.println(date2.getMonth());
		System.out.println(date2.getDayOfMonth());
		System.out.println(date2.getDayOfWeek());
		System.out.println(date2.getDayOfYear());
		LocalDate yesterday = LocalDate.parse("2026-03-13");
		System.out.println(yesterday);
		
		System.out.println(yesterday.isAfter(today));
		System.out.println(yesterday.isLeapYear());
		System.out.println(yest.isLeapYear());
		
		//To change date format
		//Date Formatter
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/YY");
		System.out.println(today);
		System.out.println(today.format(pattern));
	
		//Data and Time Stamp
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}



}
