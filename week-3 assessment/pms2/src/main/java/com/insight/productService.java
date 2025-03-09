package com.insight;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class productService {
	private List<Product> products;
	  public productService(List<Product> products) {
	        this.products = products;
	    }
	
	public Optional<Product> highprice(List<Product> products){
		return products.stream().max(Comparator.comparing(Product::getPrice));
	}
	public Optional<Product> lowestprice(List<Product> products){
		return products.stream().min(Comparator.comparing(Product::getPrice));
	}
	public List<Product> expired(List<Product> products){
		LocalDate today=LocalDate.now();
		return products.stream().filter(p->p.getExpiryDate().isBefore(today)).collect(Collectors.toList());
	}
	public List<String> expires_10(List<Product> products){
		LocalDate today=LocalDate.now();
		return products.stream().filter(p->p.getExpiryDate().isAfter(today)&&p.getExpiryDate().isBefore(today.plusDays(10))).
		map(Product::getName).collect(Collectors.toList());
	}
	public Map<String,Long> countByType(List<Product> products){
		return products.stream().collect(Collectors.groupingBy(Product::getType,Collectors.counting()));
	}
	public Map<String,Long> countBySupplier(List<Product> products){
		return products.stream().collect(Collectors.groupingBy(p->p.getSupplier().getSname(),Collectors.counting()));
	}
}
