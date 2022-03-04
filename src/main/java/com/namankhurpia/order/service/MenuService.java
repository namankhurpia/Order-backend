package com.namankhurpia.order.service;

import java.util.List;

import com.namankhurpia.order.model.txn.Menu;

public interface MenuService {
	
	List<Menu> getall(int restoid);
	
	List<String> getAllCuisineFromRestoid(int restoid);
	
	List<Menu> getMenuItemsbyRestoIdAndCuisine (int restoid, String cuisinename);
	
	Menu save(Menu itemobj);
	
	void delete(Menu itemobj);
	
}
