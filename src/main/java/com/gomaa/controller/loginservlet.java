package com.gomaa.controller;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gomaa.servece.loginservece;

@Controller
@SessionAttributes("name")
public class loginservlet {

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	//@ResponseBody
	public String name2() {
		return"login";
	}
	
//	@RequestMapping(value = "/login",method = RequestMethod.POST)
	//@ResponseBody
//	public String getinfo(@RequestParam String name,@RequestParam String password,ModelMap model) {
//		model.put("name", name);
//		model.put("password", password);
	//	System.out.println(name);
//		return"home";
//	}

	@Autowired
	loginservece check;
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	//@ResponseBody
	public String getinfov(@RequestParam String name,@RequestParam String password,ModelMap model) {

		;
		if(check.checkuservalided(name, password)) {
     	model.put("name", name);
		model.put("password", password);
		return"home";
		}
		else {
			model.put("error", "check valid user name and password");
			return"login";
		}
	//	System.out.println(name);
		
	}

}
