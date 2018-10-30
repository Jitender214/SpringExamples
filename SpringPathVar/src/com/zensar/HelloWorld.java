package com.zensar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld{
	@RequestMapping("/helloworld/{name}")
	//http://jbandari-9pydz.partnet.cisco.com:8080/SpringPathVar/helloworld/jithu if hit this url
	//any name we can give {name}
public ModelAndView helloWorld(@PathVariable("name") String name){
	ModelAndView model = new ModelAndView("hello");//hello is view name hello.jsp
	model.addObject("msg","Hi welcome to path variable program  "+name);
	return model;
	
}
	
}
