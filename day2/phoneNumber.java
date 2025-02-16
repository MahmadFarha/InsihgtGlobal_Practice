package com.insight.day2;

public class phoneNumber {
	private String areacode;
	private String exchange;
	private String extension;
	public phoneNumber(String areacode, String exchange, String extension) {
		if(areacode.length()!=3||exchange.length()!=3||extension.length()!=4) {
			throw new IllegalArgumentException("invalid");
		}
		this.areacode = areacode;
		this.exchange = exchange;
		this.extension = extension;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null||getClass()!=obj.getClass()) {
			return false;
		}
		phoneNumber other=(phoneNumber) obj;
		return this.areacode.equals(other.areacode)&&this.exchange.equals(other.exchange)&&this.extension.equals(other.extension);
	}
	@Override
	public String toString() {
		return String.format("phoneNumber (%s) %s-%s ",areacode,exchange,extension);
	}
	
	
}
