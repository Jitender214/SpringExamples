package com.springList;


import java.util.Iterator;
import java.util.List;

public class Country2 {

	private String countryName;
	List listOfStates;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List getListOfStates() {
		return listOfStates;
	}

	public void setListOfStates(List listOfStates) {
		this.listOfStates = listOfStates;
	}

	public void printStateNames(){
		
		Iterator iterator = listOfStates.iterator();
		while(iterator.hasNext()){
			String statename = (String) iterator.next();
			System.out.println("State names are "+statename);
		}
		
	}
	
}
