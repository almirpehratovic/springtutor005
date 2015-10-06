package com.springtutor.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.springtutor.model.SpecificException;

@ControllerAdvice
public class AppControllerAdvice {
	@ExceptionHandler(SpecificException.class)
	public ModelAndView handleGenericException(SpecificException e){
		ModelAndView v = new ModelAndView("specificError");
		v.addObject("exception", e);
		return v;
	}
	
	@ExceptionHandler
	public ModelAndView handleGenericException(Exception e){
		ModelAndView v = new ModelAndView("error");
		v.addObject("exception", e);
		return v;
	}
	
	@ModelAttribute("message")
	public String getSystemMessage(){
		return "This page is generated on " + new Date();
	}
}
