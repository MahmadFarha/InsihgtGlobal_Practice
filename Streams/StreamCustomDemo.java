package com.insight14.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Accountt{
	Integer id;
	String name;
	Double salary;
	public Accountt(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "accountList [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class StreamCustomDemo {
	

	public static void main(String[] args) {
		List<Accountt> accountList=Arrays.asList(new Accountt(897,"ram",90000.00),
				new Accountt(297,"farha",30000.00),
				new Accountt(457,"nishu",70000.00),
				new Accountt(197,"chandu",80000.00),
				new Accountt(323,"chitki",10000.00));
		accountList.stream().map(a->a.name).forEach(n->System.out.println(n));
		
		List<Double> newList=accountList.stream().map(a->a.salary+500).collect(Collectors.toList());
		newList.forEach(n->System.out.println(n));
		
		//sorting on name
		Comparator<Accountt> namecomp=(n1,n2)->n1.name.compareTo(n2.name);
		accountList.stream().sorted(namecomp).forEach(a->System.out.println(a));
		
		//id comparator
		Comparator<Accountt> idcomp=(n1,n2)->n1.id-n2.id;
		accountList.stream().sorted(idcomp).forEach(a->System.out.println(a));
		
		

	}

}
