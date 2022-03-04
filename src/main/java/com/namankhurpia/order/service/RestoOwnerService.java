package com.namankhurpia.order.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.namankhurpia.order.model.txn.RestoOwner;

public interface RestoOwnerService {

	RestoOwner get(int restoid);
	
	List<RestoOwner> getall();
	
	RestoOwner save(RestoOwner restoowner_obj);
	
	void delete(RestoOwner restoowner_obj);
	
	String VerifyLogin(String email) throws NoSuchAlgorithmException;
	
	RestoOwner checkIfUserExists(RestoOwner restoowner_obj);

}
