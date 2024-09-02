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
	
	@RequestMapping(value="/calcinput")
	public ModelAndView show() {
		return new ModelAndView("calc");
	}
	
	@RequestMapping(value="/calculation")
	public ModelAndView calc(HttpServletRequest req) {
		int firstNo, secondNo, result;
		firstNo = Integer.parseInt(req.getParameter("firstNo"));
		secondNo = Integer.parseInt(req.getParameter("secondNo"));
		result = firstNo + secondNo;
		String res="";
		res+=result;
		return new ModelAndView("result","res",res);
	}
}
