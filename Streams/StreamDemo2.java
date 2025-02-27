package com.insight14.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		Stream s=Stream.of(2,1,3,4,5,2,7,8,3,4,5,2,3,4);
		//lambda
		s.forEach(x->System.out.print(x+" "));
		
		//stream can only be used once
		//s.forEach(System.out::print);
		
		List<Integer> list=Arrays.asList(2,1,3,4,5,2,7,8,3,4,5,2,3,4);
		
		//method reference
		list.stream().forEach(System.out::println);
		
		//unique
		System.out.println("unique numbs");
		list.stream().distinct().forEach(System.out::println);
		
		//Serial execution, filter,limit
		//filter returns boolean
		System.out.println("numbers < 5");
		list.stream().filter(x->x<=5).distinct().limit(2).forEach(System.out::println);
		
		//parallel processing
		list.parallelStream().skip(3).filter(x->x<=5).distinct().limit(2).forEach(System.out::println);
		
		//first five ele squares, map
		//map always returns stream
		System.out.println("first 5 ele sq");
		list.stream().limit(5).map(x->Math.pow(x, 2)).forEach(System.out::println);
		
		//count of even numbers
		System.out.println("count of even");
		long count=list.stream().filter(x->(x%2)==0).count();
		System.out.println(count);
		
		//sum
		System.out.println("===sum===");
		int sum=list.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		
	}

}
