package com.namankhurpia.order.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.model.Menu;
import com.namankhurpia.order.repos.MenuRepo;

@Service
public class MenuDAOImpl implements MenuDAO{
	
	@Autowired
	MenuRepo menurepo;

	@Override
	public List<Menu> getall(int restoid) {
		return menurepo.findRestrauntMenuItemfromRestoID(restoid);
	}

	@Override
	public Menu save(Menu itemobj) {
		return menurepo.save(itemobj);
		
	}

	@Override
	public void delete(Menu itemobj) {
		menurepo.delete(itemobj);
		
	}

}
