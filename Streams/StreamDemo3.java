package com.insight14.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("payal","harsha","sai","roopa","manideep","bhavya","janakiram");
		names.stream().map(x->x.length()).forEach(n->System.out.println(n));
		names.stream().map(x->x.toUpperCase()).forEach(n->System.out.println(n));
		System.out.println("===sorted list===");
		names.stream().sorted().forEach(n->System.out.println(n));
		
		//names length wise sort , ASC
		System.out.println("===names length wise sort ===");
		Comparator<String> comp=(n1,n2)->n1.length()-n2.length();
		names.stream().sorted(comp).forEach(n->System.out.println(n));
		
		names.stream().filter(n->n.equals("sai")).forEach(x->System.out.println(x));
		names.stream().filter(x->x.endsWith("a")).forEach(x->System.out.println(x));
		
	}
}
