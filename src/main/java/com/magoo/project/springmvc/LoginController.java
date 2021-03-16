package com.magoo.project.springmvc;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@ComponentScan
@Configuration
@EnableWebMvc
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String sayHello()
	{
		return "login";
	}

}
