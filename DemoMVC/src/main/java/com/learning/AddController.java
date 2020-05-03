package com.learning;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/login")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		
		AddService ad = new AddService();
		String d = ad.add(username, password);
		
		ModelAndView mv = new ModelAndView();
		try 
		{
			if(d.equalsIgnoreCase("success"))
			{				
				mv.setViewName("display.jsp");	
				mv.addObject("result", "Login Successful");
		
			}
			else
			{
				throw new IllegalAccessException();
			}
		}
		catch(Exception e)
		{
			mv.setViewName("index.jsp");	
			mv.addObject("result", "Login Unsuccessful");
		}
		return mv;
		
		
	}

}
