package com.inisght.ady4;

public class product {
	Integer id;
	String name;
	Integer qty;
	Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public product(Integer id, String name, Integer qty, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
}
