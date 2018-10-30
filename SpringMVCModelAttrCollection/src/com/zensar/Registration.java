package com.zensar;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Registration {
private String fname;
private String lname;
private String email;
private long phno;
private Date dob;
private List<String> skills;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
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
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}


}
