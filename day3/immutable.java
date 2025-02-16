package com.insight.day3;

final class product{
	private final Integer id;
	private final String name;
	private final double price;
	public product(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class immutable {

	public static void main(String[] args) {
		product p=new product(1,"farha",3600.00);
		System.out.println(p);
		
		product p1=new product(2,"nisha",2400.00);
		System.out.println(p1);
	}

}
