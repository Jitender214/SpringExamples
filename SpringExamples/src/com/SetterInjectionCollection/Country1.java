package com.SetterInjectionCollection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country1 {

	private String country1;
	private Map<String,String> statenames1;
	public String getCountry() {
		return country1;
	}
	public void setCountry1(String country1) {
		this.country1 = country1;
	}
	public Map<String, String> getStatenames1() {
		return statenames1;
	}
	public void setStatenames1(Map<String, String> statenames1) {
		this.statenames1 = statenames1;
	}
	
	public void displayInfo(){
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiii");
		for(Entry<String, String> s:statenames1.entrySet()){
			System.out.println(s.getKey()+"...."+s.getValue());
		}
	}
}
