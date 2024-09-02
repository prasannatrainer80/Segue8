package com.hexaware.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/namedemo")
	public ModelAndView name() {
		return new ModelAndView("name");
	}
	
	@RequestMapping(value="/logincheck")
	public ModelAndView doLogin(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Hexaware") && pwd.equals("Hexaware")) {
			return new ModelAndView("success");
		} else {
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/nameshow")
	public ModelAndView show(HttpServletRequest req) {
		String firstName, lastName, fullName;
		firstName = req.getParameter("firstName");
		lastName = req.getParameter("lastName");
		fullName = firstName + " " +lastName;
		return new ModelAndView("show","fullName",fullName);
	}
}
