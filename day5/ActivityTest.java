package com.inisght.day5;

public class ActivityTest {

	public static void main(String[] args) {
		Activity activity=new Activity("hello","farha","+");
		Activity activity1=new Activity("hello","farha","-");
		Activity activity2=new Activity("hello","farha","*");
		ActivityTest a=new ActivityTest();
		try {
			if(!a.validate(activity1)) {
				throw new operatorException("invalid operator");
			}
			String result=a.dooperation(activity1);
			System.out.println(result);
		}
		catch(operatorException e) {
			e.printStackTrace();
		}
		
	}
	public boolean validate(Activity activity) {
		if(activity.getS1()==null||activity.getS2()==null||activity.getop()==null) {
			throw new NullPointerException("parameters cannot be null");
		}
		if(!activity.getop().equals("+")&&!activity.getop().equals("-")) {
			return false;
		}
		return true;
	}
	
	public String dooperation(Activity activity) {
		String s1=activity.getS1();
		String s2=activity.getS2();
		String op=activity.getop();
		
		if(op.equals("+")) {
			return s1+s2;
		}
		else if(op.equals("-")){
			return s1.replace(s2,"");
		}
		else {
			throw new IllegalArgumentException("unsupported operator");
		}
	}

}
