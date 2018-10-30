package com.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MyController extends MultiActionController {


	public ModelAndView add(HttpServletRequest request,HttpServletResponse response){
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		System.out.println("In side  Controller*************************");
		
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int sum = int1+int2;
		 return new ModelAndView("result", "sum",sum); 
	}

	public ModelAndView del(HttpServletRequest request,HttpServletResponse response){
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int sum = int1-int2;
		 return new ModelAndView("result", "sum",sum); 
	}
	
}
