package com.insight14.Streams;

import java.time.LocalDate;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product(1, "Milk", "Dairy", 10.0, 40.0, LocalDate.of(2025, 5, 1)),
                new Product(2, "Pulses", "Pulses", 5.0, 120.0, LocalDate.of(2025, 6, 15)),
                new Product(3, "Rice", "Spices", 3.0, 75.0, LocalDate.of(2025, 4, 10)),
                new Product(4, "Sunflower Oil", "Oils", 2.0, 180.0, LocalDate.of(2025, 7, 20))
        );
        ProductService p=new ProductService();
        try {
        	Product ans=p.highcostprod(productList);
        	System.out.println(ans);
            Product a1=p.lowpriceprod(productList);
            System.out.println(a1);
            List<Product> a2=p.expiredprod(productList);
            System.out.println(a2);
            List<Product> a3=p.expirein10(productList);
            System.out.println(a3);
            Long a4=p.count(productList);
            System.out.println(a4);
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
