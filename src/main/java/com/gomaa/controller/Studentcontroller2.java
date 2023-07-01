package com.gomaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gomaa.Models.Student2;
import com.gomaa.servece.StudentServece2;
import com.gomaa.validation.validuser;

@Controller
public class Studentcontroller2 {
	@Autowired
	StudentServece2 stservec;
	@Autowired
	validuser valid;
    @RequestMapping(value = "/ahmed")
	public String shoestudent(ModelMap model) {
		model.addAttribute("students",stservec.readAllStudentd());
		return "students";
	}
    
    @RequestMapping(value = "/add",method = RequestMethod.GET)
	public String addstudent(ModelMap model) {
    	return"add";
	}
    @RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addstudentpost(ModelMap model,@RequestParam String name,@RequestParam String date) {
    	if(valid.checkvalidusername(name)) {
    		    	stservec.addStudent(name,date, false);
    	model.addAttribute("after",stservec.readAllStudentd());
    	return"afteradd";
    	}
    	model.addAttribute("error", "name must be more then 3");
    	//throw new RuntimeException("this is test exception");
    	return"add";
    

    	

	}
    @RequestMapping(value = "/delet",method = RequestMethod.GET)
	public String deletstudentpost(ModelMap model,@RequestParam int id) {
    	
    	stservec.deleteStudent(id);
    	model.addAttribute("after",stservec.readAllStudentd());
    	return"afteradd";
    	

	}
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
   	public String studentgetinfot(ModelMap model,@RequestParam int id) {
       	model.addAttribute("edit",stservec.getstudentinfo(id));
       	return"updata";
       	

   	}
    @RequestMapping(value = "/updata",method = RequestMethod.GET)
   	public String updatainfostudent(ModelMap model,Student2 student2) {
    	System.out.println(student2.getId());
       	stservec.updata(student2.getId(),student2.getName(), student2.getDate(), student2.getIsActive());
       	return"afteradd";
       	

   	}
    @RequestMapping(value = "/updata",method = RequestMethod.POST)
   	public String updat2ainfostudent(ModelMap model,Student2 student2) {
    	System.out.println(student2.getId());
       	stservec.updata(student2.getId(),student2.getName(), student2.getDate(), student2.getIsActive());
       	return"afteradd";
       	

   	}



}
