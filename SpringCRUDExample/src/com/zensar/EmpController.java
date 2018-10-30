package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmployeeDAO dao;
	@RequestMapping(value="/empform")  
	   public ModelAndView showForm(){  
	       
	        return new ModelAndView("empform");//will redirect to viewemp request mapping  
	    }  
	@RequestMapping(value="/save",method = RequestMethod.POST)  
	   public ModelAndView saveEmp(@ModelAttribute("emp") Employee e){  
	        dao.save(e);  
	        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
	    }  

}
