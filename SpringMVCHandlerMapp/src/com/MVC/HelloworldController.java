package com.MVC;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class HelloworldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse response)
	{
		String message = "Hello welcome to spring MVC";
		//request.setAttribute(message, message);
		return new ModelAndView("hellopage","message",message);
		
	}
		
}
