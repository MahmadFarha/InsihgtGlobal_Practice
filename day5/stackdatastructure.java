package com.inisght.day5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Stack;

public class stackdatastructure {
//	public static void main(String[] args) {
//		Stack<contact> st=new Stack<>();
//		st.push(new contact("mahmad","farha","fathima",LocalDate.of(2003,Month.SEPTEMBER,22),"f","7078098789"));
//		st.push(new contact("abc","user1","ig",LocalDate.of(2005,Month.OCTOBER,06),"f","7078098789"));
//		st.push(new contact("def","nisha","fathima",LocalDate.of(2002,Month.FEBRUARY,14),"f","7078098789"));
//		st.push(new contact("hihi","user2","ig",LocalDate.of(2006,Month.SEPTEMBER,22),"f","7078098789"));
//		System.out.println(st);
//	}
	
	private contact[] stack;
	private int top;
	private int maxsize;
	public stackdatastructure(int size) {
		maxsize=size;
		stack=new contact[size];
		top=-1;
	}
	public void push(contact c) throws stackOverflowException,InvalidContactException{
		if(isFull()) {
			throw new stackOverflowException("stack is full,please remove an item first");
		}
		if(!c.isValid()) {
			throw new InvalidContactException("phone number is invalid");
		}
		stack[++top]=c;
		System.out.println("contact added successfully");
	}
	public contact pop() throws stackUnderflowException{
		if(isEmpty()) {
			throw new stackUnderflowException("contact list is empty,cannot delete");
		}
		contact poppedcontact=stack[top];
		top--;
		return poppedcontact;
	}
	public boolean isFull() {
		return top==maxsize-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public contact peek() throws stackUnderflowException{
		if(isEmpty()) {
			throw new stackUnderflowException("contact list is empty");
		}
		return stack[top];
	}
	public void displaystack() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
			return;
		}
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	
	
}