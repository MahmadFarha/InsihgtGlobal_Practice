package com.model;

public class Scholar {
    private int rollno;
    private String name;
    private String email;
    private String mobile;

    // Constructor, getters, setters
    
    public Scholar(int rollno, String name, String email, String mobile) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public Scholar() {
		super();
	}

	public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}