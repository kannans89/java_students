package com.techlabs.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public void validate(String userName, String password) {
		System.out.println(userName+"  "+password);
	}

}
