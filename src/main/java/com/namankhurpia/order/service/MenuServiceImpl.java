package com.namankhurpia.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.MenuDAO;
import com.namankhurpia.order.model.Menu;

@Component
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	public MenuDAO daoobj;

	@Transactional
	@Override
	public List<Menu> getall(int restoid) {
		return daoobj.getall(restoid);
	}

	@Transactional
	@Override
	public Menu save(Menu itemobj) {
		return daoobj.save(itemobj);
	}

	@Transactional
	@Override
	public void delete(Menu itemobj) {
		daoobj.delete(itemobj);
	}
	
}
