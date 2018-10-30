package com.zensar;

public class Employee {

	private int empid;
	private String empname;
	private String empadd;
	
	public Employee(int empid, String empname, String empadd) {
		        this.empid = empid;
		        this.empname = empname;
		        this.empadd = empadd;
		    }

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	
}
