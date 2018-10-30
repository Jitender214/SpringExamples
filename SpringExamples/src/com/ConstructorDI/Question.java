package com.ConstructorDI;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String qname;
	private List<String> answers;
	public Question(int id, String qname, List<String> answers) {
		//super();
		this.id = id;
		this.qname = qname;
		this.answers = answers;
		
	}
	public void display(){
		 System.out.println(id+" "+qname);  
		 System.out.println("Answers are ");
		Iterator itr=answers.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}
}
