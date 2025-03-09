package com.insight;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ui {

	public static void main(String[] args) {
		 Supplier s1 = new Supplier(1, "ABC Supplies");
	     Supplier s2 = new Supplier(2, "XYZ Traders");
	     Supplier s3 = new Supplier(3, "FoodMart");
	      List<Product> productList = Arrays.asList(
	                new Product(101, "Milk", "Dairy", 2.0, 50.0, LocalDate.of(2025, 3, 20), s1),
	                new Product(102, "Almonds", "Pulses", 1.5, 200.0, LocalDate.of(2024, 3, 10), s2),
	                new Product(103, "Olive Oil", "Oils", 1.0, 500.0, LocalDate.of(2024, 3, 7), s3),
	                new Product(104, "Sugar", "Snacks", 3.0, 80.0, LocalDate.of(2024, 2, 28), s1), // Expired
	                new Product(105, "Tea Powder", "Spices", 0.5, 120.0, LocalDate.of(2024, 3, 15), s2)
	       );
	     productService service = new productService(productList);
	     System.out.println("highest price product"+service.highprice(productList));
	     System.out.println("lowest priced product"+service.lowestprice(productList));
	     System.out.println("expired products"+service.expired(productList));
	     System.out.println("products expiring in 10 days"+service.expires_10(productList));
	     System.out.println("product count by type"+service.countByType(productList));
	     System.out.println("product count by supplier"+service.countBySupplier(productList));
	}

}
