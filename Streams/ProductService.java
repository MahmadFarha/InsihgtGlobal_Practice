package com.insight14.Streams;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
	public Product highcostprod(List<Product> plist) {
		return plist.stream().max(Comparator.comparing(Product::getPrice)).orElse(null);
	}
	
	public Product lowpriceprod(List<Product> plist) {
		return plist.stream().min(Comparator.comparing(Product::getPrice)).orElse(null);
	}
	
	public List<Product> expiredprod(List<Product> plist){
		return plist.stream().filter(x->x.getExpiryDate().isBefore(LocalDate.now())).collect(Collectors.toList());
	}
	
	public List<Product> expirein10(List<Product> plist){
		return plist.stream().filter(x->!x.getExpiryDate().isBefore(LocalDate.now())&&x.getExpiryDate().isBefore(LocalDate.now().plusDays(10))).collect(Collectors.toList());
	}
	public Long count(List<Product> plist) {
		return plist.stream().map(x->x.getType()).distinct().count();
	}
	
}
