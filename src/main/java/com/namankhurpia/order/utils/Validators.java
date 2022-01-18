package com.namankhurpia.order.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.model.RestoOwner;
import com.namankhurpia.order.repos.RestoOwnerRepo;

@Service
public class Validators {
	
	@Autowired
	RestoOwnerRepo retoownerrepo;
	
	public boolean is_valid_phone(RestoOwner restoowner_ob)
	{
		//returns true if ACCEPTABLE
		return (retoownerrepo.is_valid_phone(restoowner_ob.getPhoneno())==0)?true:false;
	}
	
	public boolean is_valid_email(RestoOwner restoowner_ob)
	{
		//returns true if ACCEPTABLE
		return (retoownerrepo.is_valid_email(restoowner_ob.getEmail())==0)?true:false;
	}

}
