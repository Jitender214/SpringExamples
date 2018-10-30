package com.SetterInjectionCollection;

import java.util.*;

public class Country {

	private String country;
	private Set<String> statenames;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<String> getStatenames() {
		return statenames;
	}

	public void setStatenames(Set<String> statenames) {
		this.statenames = statenames;
	}

	public void display(){
		//Iterator<String> itr = statenames.iterator();
		System.out.println("Country is : "+country);
		System.out.println("State are: ");
		for(String str : statenames){
			System.out.println(str);
		}
	}
}
