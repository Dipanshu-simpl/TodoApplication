package com.magoo.project.springmvc;


import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.magoo.project.UserValidationService;

@Controller
public class LoginController {
	
	Logger logger=Logger.getLogger(LoginController.class);
	
	/*@Autowired
	UserValidationService service;*/
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showLoginForm(ModelMap model)
	{
		logger.debug("came inside showLoginForm() Method:");
		model.put("name","in28Minutes");
		return "welcome";
	}
	
	private String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}
	

}
