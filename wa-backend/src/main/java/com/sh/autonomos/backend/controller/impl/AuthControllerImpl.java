package com.sh.autonomos.backend.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sh.autonomos.backend.controller.AuthController;

@RestController
public class AuthControllerImpl implements AuthController {

	@Override
	@RequestMapping(path = "/login")
	public void login() {
		// TODO Auto-generated method stub
	}

	@Override
	@RequestMapping(path = "/logout")
	public void logout() {
		// TODO Auto-generated method stub

	}

}
