package com.magoo.project.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	  
	private org.apache.juli.logging.Log logger=LogFactory.getLog(ExceptionHandler.class);
	
	
	public String handleException(HttpServletRequest request, Exception ex)
	{
		logger.error("Request"+ request.getRequestURL());
		return "error";
	}
	
}
