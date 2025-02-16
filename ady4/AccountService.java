package com.inisght.ady4;

import java.util.ArrayList;

public class AccountService {
	ArrayList<Account> l=new ArrayList<>();
	public void addaccount(Account a) {
		l.add(a);
	}
	public void listaccounts() {
		l.forEach(x->System.out.println(x));
	}
	public String getnamebyacc(Account a) {
		return a.name;
	}
	public String delaccbyid(int id) {
		for(int i=0;i<l.size();i++) {
			if(l.get(i).id==id) {
				l.remove(i);
			}
		}
		return "deleted";
	}
}
