package com.inisght.ady4;

import java.util.ArrayList;
import java.util.List;

public class productservice {
	static List<product> plist=new ArrayList<>();
	public String addproduct(product p) {
		plist.add(p);
		return "success";
	}
	public String deleteproduct(product p) {
		if(plist.contains(p)) {
			plist.remove(p);
		}
		return "success";
	}
	public void updateproduct(product p) {
		for(product x:plist) {
			if(x.getId()==p.getId()) {
				x.setName(p.getName());
				x.setQty(p.getQty());
				x.setPrice(p.getPrice());
			}
		}
	}
	public void listproducts() {
		plist.forEach(x->System.out.println(x));
	}
	public product getprobyid(Integer id) {
		for(product x:plist) {
			if(x.getId()==id) {
				return x;
			}
		}
		return null;
	}
	public Double getpricebyid(Integer id) {
		for(product x:plist) {
			if(x.getId()==id) {
				return x.getPrice();
			}
		}
		return 0.0;
	}
}
