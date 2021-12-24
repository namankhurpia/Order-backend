package com.namankhurpia.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.RestoOwnerDAO;
import com.namankhurpia.order.model.RestoOwner;

@Service
public class RestoOwnerServiceImpl implements RestoOwnerService {
	
	@Autowired
	private RestoOwnerDAO restoownerdao;

	@Transactional
	@Override
	public RestoOwner get(int restoid) {
		return restoownerdao.getone(restoid);
	}

	@Transactional
	@Override
	public RestoOwner save(RestoOwner restoowner_obj) {
		return restoownerdao.save(restoowner_obj);
	}


	@Transactional
	@Override
	public void delete(RestoOwner restoowner_obj) {
		restoownerdao.delete(restoowner_obj);
	}

	@Transactional
	@Override
	public List<RestoOwner> getall() {
		return restoownerdao.getall();
	}

}
