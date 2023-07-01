package com.gomaa.validation;

import org.springframework.stereotype.Service;

@Service
public class validuser {
	public boolean checkvalidusername(String name) {
		if(name.length()>3) {
			return true;
		}
		return false;
	}

}
