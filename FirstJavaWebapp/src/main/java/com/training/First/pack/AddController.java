package com.training.First.pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping(value="/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mv= new ModelAndView();
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int c=num1+num2;
		
		mv.addObject("result ",c);
		mv.setViewName("addResult");
		return mv;
		
	}
	
//	@RequestMapping(value="/sub")
//	public ModelAndView sub(HttpServletRequest req, HttpServletResponse res) {
//		
//		ModelAndView mvs= new ModelAndView();
//		int num1 = Integer.parseInt(req.getParameter("n1"));
//		int num2 = Integer.parseInt(req.getParameter("n2"));
//		
//		int c=num1-num2;
//		
//		mvs.addObject("result ",c);
//		mvs.setViewName("subResult");
//		return mvs;
//		
//	}
}
