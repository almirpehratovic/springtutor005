package com.springtutor.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springtutor.model.SpecificException;

@Controller
@RequestMapping("/exception")
public class ExceptionController {
	@RequestMapping(method=RequestMethod.GET)
	public String defaultView(){
		return "showMessage";
	}
	
	@RequestMapping(value="/specific")
	public String generateSpecificException(Model model) {
		if (1==1){
			throw new SpecificException("Database couldn't be reached!", new Date());
		}
		model.addAttribute("This message will not be shown!");
		return "showMessage";
	}
	@RequestMapping(value="/generic")
	public String generateGenericException(Model model) throws Exception {
		if (1==1){
			throw new Exception("Server is not responding!");
		}
		model.addAttribute("This message will not be shown!");
		return "showMessage";
	}
}
