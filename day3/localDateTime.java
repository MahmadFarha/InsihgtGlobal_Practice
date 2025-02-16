package com.insight.day3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class localDateTime {

	public static void main(String[] args) {
		LocalDate current=LocalDate.now();
		LocalDate ind_day=LocalDate.of(1947,Month.AUGUST,15);
		System.out.println(current);
		System.out.println(ind_day);
		System.out.println(current.plusDays(1));
		System.out.println(current.minusMonths(1));
		
		ZonedDateTime curr=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(curr);
		
		//period
		LocalDate start=LocalDate.of(2001,Month.FEBRUARY,14);
		LocalDate today=LocalDate.now();
		Period period=start.until(today);
		System.out.println(period);
		
		//datetime formatter
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date in dd/mm/yyyy format");
		String input=sc.nextLine();
		LocalDate entered=LocalDate.parse(input,formatter);
		System.out.println(entered);
		
		
	}

}
