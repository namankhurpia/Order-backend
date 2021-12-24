package com.namankhurpia.order.DAO;

import java.util.List;

import com.namankhurpia.order.model.Menu;

public interface MenuDAO {

	List<Menu> getall(int restoid);
	
	Menu save(Menu itemobj);
	
	void delete(Menu itemobj);
	
}
