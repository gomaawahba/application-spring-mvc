package com.gomaa.servece;

import org.springframework.stereotype.Service;

//authentication
	@Service
public class loginservece {

	public boolean checkuservalided(String name,String password){
		if(name.equalsIgnoreCase("gomaa wahba") && password.equals("gomaa")) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
