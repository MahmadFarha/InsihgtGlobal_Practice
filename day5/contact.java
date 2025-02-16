package com.inisght.day5;

import java.time.LocalDate;

public class contact {
	private String Firstname;
	private String MiddleName;
	private String LastName;
	private LocalDate dob;
	private String gender;
	private String mob_no;
	
	public contact(String firstname, String middleName, String lastName, LocalDate dob, String gender, String mob_no) {
		super();
		Firstname = firstname;
		MiddleName = middleName;
		LastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.mob_no = mob_no;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public boolean isValid() {
		return mob_no!=null && mob_no.length()==10;
	}
	@Override
	public String toString() {
		return "contact [Firstname=" + Firstname + ", MiddleName=" + MiddleName + ", LastName=" + LastName + ", dob="
				+ dob + ", gender=" + gender + ", mob_no=" + mob_no + "]";
	}
}
