package com.ConstructDI;

public class Student {
	private int sno;
	private String sname;
	Address add;
	
	public Student(int sno, String sname,Address add) {
		this.sno=sno;
		this.sname=sname;
		this.add=add;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
