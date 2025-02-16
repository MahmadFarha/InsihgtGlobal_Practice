package com.inisght.ady4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class student{
	Integer id;
	String name;
	student(Integer id,String name){
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}

	
}
public class mapdemo {
	public static void main(String[] args) {
	   Hashtable<Integer,String> map=new Hashtable<>();
	   map.put(1,"farha");
	   map.put(4,"tha");
	   map.put(5,"nish");
	   
	   System.out.println(map);
	   Set<Integer> keys=map.keySet();
	   System.out.println(keys);
	   Collection<String> val=map.values();
	   System.out.println(val);
	   
	   Set entries=map.entrySet();
	   System.out.println(entries);
	   Iterator i=entries.iterator();
	   while(i.hasNext()) {
		   System.out.println(i.next()+" ");
	   }
	   HashMap<Integer,student> stumap=new HashMap<>();
	   stumap.put(3,new student(404,"nishu"));
	   System.out.println(stumap);
	   
	   for(Map.Entry<Integer,student> e:stumap.entrySet()) {
		   System.out.println("key : "+e.getKey()+" value : "+e.getValue());
	   }
	}
}
