package com.namankhurpia.order.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.model.txn.RestoOwner;
import com.namankhurpia.order.repos.RestoOwnerRepo;

@Service
public class Validators {
	
	@Autowired
	RestoOwnerRepo retoownerrepo;
	
	public boolean is_valid_phone(RestoOwner restoowner_ob)
	{
		//returns true if ACCEPTABLE i.e. user does not exist
		return (retoownerrepo.is_valid_phone(restoowner_ob.getPhoneno())==0)?true:false;
	}
	
	public boolean is_valid_email(RestoOwner restoowner_ob)
	{
		//returns true if ACCEPTABLE i.e. user does not exist
		return (retoownerrepo.is_valid_email(restoowner_ob.getEmail())==0)?true:false;
	}
	
	public boolean CheckIfUserExistsUsingEmail(RestoOwner restoowner_ob)
	{
		//returns true if user exists
		return (retoownerrepo.CheckIfUserExistsUsingEmail(restoowner_ob.getEmail())==1)?true:false;
	}
	
	public RestoOwner getUserFromEmail (RestoOwner restoowner_obj)
	{
		return retoownerrepo.GetUserFromEmail(restoowner_obj.getEmail());
	}

}
