package com.zensar;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping(value="/login.html",method=RequestMethod.GET)
	public ModelAndView getform(){
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	@RequestMapping(value="/submitForm.html",method=RequestMethod.POST)
	public ModelAndView process(@Valid @ModelAttribute("registration")Registration registration,BindingResult result){
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("index");
			System.out.println("in result has error......................");
			return model;
		}
		
		ModelAndView model = new ModelAndView("success");
		System.out.println("in success page...............");
		return model;
		
	}
	@ModelAttribute
	public void CommonObject(Model model){
		model.addAttribute("msg","Welcome...");
	}
}
