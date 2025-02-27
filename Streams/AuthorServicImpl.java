package com.insight14.Streams;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AuthorServicImpl {
	public Set<String> getUniqueSurnames(List<Author> authorList){
		return authorList.stream().map(Author::getSurname).distinct().collect(Collectors.toSet());
	}
	public List<Author> getAuthorsByCity(List<Author> authorList,String city){
        return authorList.stream().filter(a->a.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
	}
	
	public double femaleAverageAge(List<Author> authorList) {
		return authorList.stream().filter(a->a.getGender().equalsIgnoreCase("female")).mapToInt(author->calculateage(author.getBirthdate())).average().orElse(0.0);
	}
	public Long getMobileByAdhar(List<Author> authorList,Long adharCard) {
		//map(x -> x.getMobile()): This line will return an Optional<Long> because you're using stream() to operate on the list,
		//and the stream's operations could yield null or an empty result.
		//You need to handle the case where no value is found. For this, the correct approach is to use
		//.findFirst() or .findAny()  followed by .orElse()
		
		return authorList.stream().filter(a->a.getAdharCard().equals(adharCard)).map(x->x.getMobile()).findFirst().orElse(1L);
	}
	
	
	public static int calculateage(LocalDate dob) {
		if(dob==null) return 0;
		Period p=Period.between(dob, LocalDate.now());
		return p.getYears();
	}
	
}
