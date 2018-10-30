package com.ConstructorDI;

public class Employee {

	private int id;
	private String ename;
	public Employee(){
		System.out.println("default constructor");
	}
	public Employee(int id){
		this.id=id;
		System.out.println("int Constructor called....."+id);
	}
	public Employee(String ename){
		this.ename=ename;
		System.out.println("String Constructor called....."+ename);
	}
	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}
	public void show(){
		System.out.println(id+"....."+ename);
	}
}
