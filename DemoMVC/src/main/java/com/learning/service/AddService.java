package com.learning.service;

public class AddService {
	
	public String add(String username, String password)
	{
		if(username.equalsIgnoreCase("appi") && password.equalsIgnoreCase("appi"))
		{
			return "success";
		}
		return "failure";
		
	}

}
