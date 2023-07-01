package com.gomaa.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptioncontroller {
	@ExceptionHandler(value = Exception.class)
	public String handlexception(HttpServletRequest request,Exception ex) {
		System.out.println("Request:"+request.getRequestURL()+"error:"+ex.getMessage());
		return"error";
		
	}

}
