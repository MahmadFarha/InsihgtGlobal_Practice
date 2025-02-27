package com.insight14.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamDemo4 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(-9,-18,0,25,4);
		Integer min=list.stream().min(Integer::compare).get();
		System.out.println("min "+min);
		
		Integer max=list.stream().max(Integer::compare).get();
		System.out.println("max "+max);
		
		Stream<String> s=Stream.of("3","4","5");
		
		double ans=s.collect(Collectors.averagingDouble(num->Double.parseDouble(num)));
		System.out.println("Double average "+ans);
		
		Stream<String> s1=Stream.of("3","4","5");
		double ans1=s1.collect(Collectors.averagingInt(num->Integer.parseInt(num)));
		System.out.println("average "+(int)ans1);
		
		Stream<Integer> l1=Stream.of(1,2,3,14,15,34,100);
		System.out.println("strats with 1");
		l1.map(String::valueOf).filter(x->x.startsWith("1")).forEach(n->System.out.println(n));
		
		String name="insightglobal";
		Map<Character, Long> countoccur = name.chars()  // Convert the string into an IntStream
	            .mapToObj(c -> (char) c)  // Convert the IntStream to a Stream<Character>
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		countoccur.forEach((character, count) -> System.out.println(character + ": " + count));
		
		
		//display lowest length palindrome using stream api
		List<String> pallindromeList=Arrays.asList("madam","liril","aba","tomato","apple");
		Optional<String> smallp=pallindromeList.stream().filter(streamDemo4::ispalindrome).min(Comparator.comparingInt(String::length));
		
		smallp.ifPresent(p->System.out.println(p));
		
		if(!smallp.isPresent()) {
			System.out.println("no palindrome found");
		}
		
		
		//using sort,limit
		/* Optional<String> smallestPalindrome = palindromeList.stream()
	            .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))  // Filter palindromes
	            .sorted(Comparator.comparingInt(String::length))  // Sort by length of the palindrome
	            .limit(1)  // Get only the smallest palindrome
	            .findFirst(); */
	}
	 
	public static boolean ispalindrome(String s) {
		String reversed=new StringBuilder(s).reverse().toString();
		return s.equals(reversed);
	}
	

}
