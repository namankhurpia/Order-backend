package com.namankhurpia.order.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.order.model.Login;
import com.namankhurpia.order.service.RestoOwnerService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController  
public class LoginController {
	
	@Autowired
	private RestoOwnerService restoownerservice;
	
	
	@PostMapping("/loginverify")
	public boolean VerifyLogin(@RequestBody Login loginobj) throws NoSuchAlgorithmException
	{
		return (restoownerservice.VerifyLogin(loginobj.getEmail().trim()).equalsIgnoreCase(loginobj.getChecksum().trim()))? true:false;
	}

}
