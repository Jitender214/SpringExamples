package com.ConstructorDI;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Student {
	
	private int id;
	private Map names;
	public Student(int id,Map names) {
		super();
		this.id=id;
		this.names = names;
	}
	
	public void display(){
		Set set = names.keySet();
		for(Object str : set){
			
        	System.out.println("student firstname "+str+" last name "+names.get(str));
        
	}
	}
}
