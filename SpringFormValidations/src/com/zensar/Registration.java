package com.zensar;


import org.hibernate.validator.constraints.NotEmpty;

public class Registration {

	@NotEmpty
	private String name;
	
	@NotEmpty
	private String email;
	
	private long phno;
	private int dob;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	
}
