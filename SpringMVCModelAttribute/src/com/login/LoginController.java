package com.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/hello")
	public ModelAndView Login(HttpServletRequest req , HttpServletResponse res){
		String uname=req.getParameter("name");
		String pwd = req.getParameter("password");
		if(uname.equals("jithu") && pwd.equals("jithu")){
			String message1 = "Hello Welcome..username: "+uname+" and pwd is: "+pwd;
			return new ModelAndView("success","message" ,message1);
			
		}
		else{
			return new ModelAndView("error","message" ,"Sorry, username or password error");	
	}
	}
}
