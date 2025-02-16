package com.inisght.day5;

import java.time.LocalDate;
import java.time.Month;

public class contactTest {

	public static void main(String[] args) throws stackUnderflowException,stackOverflowException,InvalidContactException {
		stackdatastructure st=new stackdatastructure(3);
		st.push(new contact("mahmad", "farha", "fathima", LocalDate.of(2003, Month.SEPTEMBER, 22), "f",
					"7078098789"));
		st.push(new contact("abc", "user1", "ig", LocalDate.of(2005, Month.OCTOBER, 06), "f", "7078098789"));
		st.push(new contact("def", "nisha", "fathima", LocalDate.of(2002, Month.FEBRUARY, 14), "f", "7078098789"));
		st.push(new contact("hihi", "user2", "ig", LocalDate.of(2006, Month.SEPTEMBER, 22), "f",
					"7078098789"));

		//System.out.println(st);
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println("handled stackunderflow exception");
	}
}
