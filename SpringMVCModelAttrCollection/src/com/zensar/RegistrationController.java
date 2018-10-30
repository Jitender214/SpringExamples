package com.zensar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@RequestMapping(value="/submitFrom.html",method= RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("Reg") Registration Reg){
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg","Please see the below details submitted by you...");
		return model;
	
	}
}
