package com.gomaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gomaa.servece.StudentServece2;
import com.gomaa.servece.Studentservece;

@Controller
@RequestMapping(value = "/student",method = RequestMethod.GET)

public class Studentcintroller {
	
	@Autowired
	StudentServece2 studentservece2;
	//Studentservece2 studentservece2;
	public String showstudent(ModelMap model ) {
		model.addAttribute("students",studentservece2.readAllStudentd() );
		return"students";
	}
	

}
