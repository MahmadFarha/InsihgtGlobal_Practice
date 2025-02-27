package com.insight14.Streams;

import java.time.LocalDate;

public class Product {
	Integer id;
	String name;
	String type;  //ex dairy,pulses,spices,oils,snacks
    Double qty;
	Double price;
	LocalDate  expiryDate;
	public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.qty = qty;
		this.price = price;
		this.expiryDate = expiryDate;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", qty=" + qty + ", price=" + price
				+ ", expiryDate=" + expiryDate + "]";
	}

}
