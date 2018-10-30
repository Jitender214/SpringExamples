package com.SpringMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	private int snum;
	 public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	Map stuNames;

	public Map getStuNames() {
		return stuNames;
	}

	public void setStuNames(Map stuNames) {
		this.stuNames = stuNames;
	}
	 public void printDetails(){
		Set mapSet = stuNames.entrySet();
	 Iterator iterator =  mapSet.iterator();
	 while(iterator.hasNext()){
		 Map.Entry names = (Entry) iterator.next();
		 String key = (String) names.getKey();
		 String value = (String) names.getValue();
		 System.out.println("Student names are "+value);
	 }
	 }
}
