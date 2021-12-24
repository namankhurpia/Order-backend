package com.namankhurpia.order.service;

import java.util.List;

import com.namankhurpia.order.model.Menu;

public interface MenuService {
	
	List<Menu> getall(int restoid);
	
	Menu save(Menu itemobj);
	
	void delete(Menu itemobj);
	
}
