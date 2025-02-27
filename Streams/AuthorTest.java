package com.insight14.Streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class AuthorTest {

	public static void main(String[] args) {
		AuthorServicImpl a=new AuthorServicImpl();
		List<Author> authorList = Arrays.asList(
	            new Author(123456789012L, "Smith", "John", "Doe", LocalDate.of(1990, 5, 15), "Male", "New York", 9876543210L),
	            new Author(987654321098L, "Johnson", "Emily", "Davis", LocalDate.of(1985, 8, 25), "Female", "Los Angeles", 1234567890L),
	            new Author(112233445566L, "Williams", "David", "Brown", LocalDate.of(1992, 11, 10), "Male", "Chicago", 1122334455L),
	            new Author(998877665544L, "Taylor", "Sophia", "Miller", LocalDate.of(1988, 3, 30), "Female", "San Francisco", 9988776655L)
	     );
		try {
			Set<String> ans=a.getUniqueSurnames(authorList);
			System.out.println(ans);
			
			List<Author> a1=a. getAuthorsByCity(authorList,"pune");
			System.out.println(a1);
			
			double a2= a.femaleAverageAge(authorList);
			System.out.println(a2);
			
			Long a3=a.getMobileByAdhar(authorList,112233445566L);
			System.out.println(a3);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
