package com.namankhurpia.order.DAO;

import java.util.List;

import com.namankhurpia.order.model.RestoOwner;

public interface RestoOwnerDAO {
	
	RestoOwner getone(int resotid);
	
	List<RestoOwner> getall();
	
	RestoOwner save(RestoOwner restoowner_obj);
	
	void delete(RestoOwner restoowner_obj);
	
	String findRestoownerIdFromEmail(String email); 

}
