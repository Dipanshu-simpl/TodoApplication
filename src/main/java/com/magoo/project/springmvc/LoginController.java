package com.magoo.project.springmvc;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.magoo.project.UserValidationService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	Logger logger=Logger.getLogger(LoginController.class);
	
	@Autowired
	UserValidationService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginForm()
	{
		logger.debug("came inside showLoginForm() Method:");
		return "login";
	}
	
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		logger.debug("came inside handleLoginRequest() Method:");
		if(service.isUserValid(name, password))
		{
		model.put("name", name);
		model.put("password", password);
		System.out.println(name);
		
		return "welcome";
		}
		
		model.put("errorMessage", "Invalid Credentials");
		return "login";
	}

}
