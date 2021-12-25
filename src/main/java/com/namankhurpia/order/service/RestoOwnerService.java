package com.namankhurpia.order.service;

import java.util.List;

import com.namankhurpia.order.model.RestoOwner;

public interface RestoOwnerService {

	RestoOwner get(int restoid);
	
	List<RestoOwner> getall();
	
	RestoOwner save(RestoOwner restoowner_obj);
	
	void delete(RestoOwner restoowner_obj);

}