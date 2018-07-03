package com.mx.demo.manoexperta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.demo.manoexperta.bo.LoginBO;
import com.mx.demo.manoexperta.response.ResponseLogin;

@RestController
public class LoginController {
	@Autowired
	private LoginBO loginBO;

	@RequestMapping(value = "/stdLogin.cfc", method = RequestMethod.POST)
	public ResponseLogin login(@RequestParam("pass") String pass, @RequestParam("user") String user) {
		return loginBO.login(pass, user);
	}

}
