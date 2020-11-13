package com.senforage.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	@RequestMapping("/login")
	public String Accueil() {
		return "user/login";
	}
	
	@RequestMapping("/")
	public String Login() {
		return "client/addClient";
	}
	
	@RequestMapping(value="/logon")
	public String logon(ModelMap map, HttpServletRequest req, HttpServletResponse res) {
		//methode 1 : Recuperation du username (ou princiapl)
		String user = req.getRemoteUser();
		System.out.println("Principal is : " + user);
		//methode 2 : Recuperation du username (ou principal)
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("Principal is : " + name);
		
		if(user != null)
		    return "client/addClient";
		else
			return "user/login";	
	}
	
	@RequestMapping(value="/Admin/403")
	public String erro() {
		return "error/403";
	}

}
