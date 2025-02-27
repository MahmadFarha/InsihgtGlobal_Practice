package com.insight14.Streams;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Candidate{
	String name;
	String city;
	String tech;
	Integer expertise;
	public Candidate(String name, String city, String tech, Integer expertise) {
		super();
		this.name = name;
		this.city = city;
		this.tech = tech;
		this.expertise = expertise;
	}
	@Override
	public String toString() {
		return "candidate [name=" + name + ", city=" + city + ", tech=" + tech + ", expertise=" + expertise + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Integer getExpertise() {
		return expertise;
	}
	public void setExpertise(Integer expertise) {
		this.expertise = expertise;
	}
	
}

public class CandidateStreamingOperations {

	public static void main(String[] args) {
	    List<Candidate> c=InterviewRepository.getCandidateList();
		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
		c.stream().filter(candidate -> "Pune".equals(candidate.city)).forEach(candidate->System.out.println(candidate.name));
		
		
		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		Map<String,Long> countcand=c.stream().collect(Collectors.groupingBy(Candidate::getCity,Collectors.counting()));
		countcand.forEach((city,y)->System.out.println(city+" : "+y));
		
		
		

		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		
		Map<String,Long> counttech=c.stream().collect(Collectors.groupingBy(Candidate::getTech,Collectors.counting()));
		counttech.forEach((tech,y)->System.out.println(tech+" : "+y));
		
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		//listing candidates with highest experience
        System.out.println("Sorted List of Candidates by Experience");

		//sort the candidates by city name
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}