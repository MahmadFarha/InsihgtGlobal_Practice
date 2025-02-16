package com.insight.day1;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class string {

	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2="hello";
		String s3="hello";
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		System.out.println(s1.charAt(4));
		System.out.println(s1.toUpperCase());
		String str="   hiii   ";
		System.out.println(str.trim());
		System.out.println(str.contains("ii"));
		String n1=str.replace('i', 'a');
		System.out.println(str);
		System.out.println(n1);
		str.indexOf('a');
		String sen="apple,banana,guava";
		String[] words=sen.split(",");	
		System.out.println(Arrays.toString(words));
		String n=String.join("-","2025","15","feb");
		System.out.println(n);
		StringBuffer sb=new StringBuffer();
		sb.append("farha");
		System.out.println(sb.capacity());
	    System.out.println(sb.insert(2,'a'));
	    System.out.println(sb.reverse());
	    StringBuilder sbb=new StringBuilder();
	    sbb.append("fathima");
	    System.out.println(sbb.append("mahmad"));
	    
	    
	    String line="farha,fathima,mahmad,cbit,hyderabad";
	    StringTokenizer st=new StringTokenizer(line,",");
	    while(st.hasMoreTokens()) {
	    	System.out.println(st.nextToken());
	    }
	    
	    StringJoiner sj=new StringJoiner("-");
	    sj.add("cbit");
	    sj.add("mgit");
	    sj.add("kl");
	    sj.add("gitam");
	    System.out.println(sj.toString());
	}
}
