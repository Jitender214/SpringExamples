package com.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegisterController {
	@RequestMapping(value="/submitFrom.html",method = RequestMethod.POST)
	//explicitly binding request parameters values into userdefined object with below code
	
	/* public ModelAndView SubmitForm(@RequestParam("fname") String fname,@RequestParam("lname") String lname,
			@RequestParam("mail") String mailid){
		//@RequestParam is to get the data from text fields-- like getParameter()
		//binding request parameters values into userdefined object with below code
		RegStudent regStudent= new RegStudent();
		regStudent.setFname(fname);
		regStudent.setLname(lname);
		regStudent.setEmail(mailid);
		ModelAndView model = new ModelAndView("success");
	  //model.addObject("msg","details submitted by you "+fname+" Last Name"+lname+" Mail id "+mailid);
	  
	  System.out.println("In side controller");
		model.addObject("msg","Hello welcome..please see the below details submitted by you");
		model.addObject("regStudent",regStudent);
		return model;
	}*/
	
	//it will automatically bind all req parameters or form elements with corresponding to regStudent Obj
	//by using @ModelAttribute
	public ModelAndView SubmitForm(@ModelAttribute("regStudent1") RegStudent regStudent1){
		ModelAndView model = new ModelAndView("success");
		//model.addObject("msg","Hello welcome..please see the below details submitted by you");
		return model;
		
	}
	
	//@ModelAttribute at method level
	// to add header level message then, if we add any message to model and view object
	@ModelAttribute
	public void commonObject(Model model){
		model.addAttribute("msg","Hello welcome..please see the below details submitted by you");
	}
}
