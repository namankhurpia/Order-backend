package com.namankhurpia.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.RestoCuisineDetailDAO;
import com.namankhurpia.order.model.txn.RestoCuisineDetail;

@Service
public class RestoCuisineDetailServiceImpl implements RestoCuisineDetailService{
	
	@Autowired
	RestoCuisineDetailDAO cuisineDao;

	@Transactional
	@Override
	public List<RestoCuisineDetail> getAllCuisineFromRestoId(int restoid) {
		return cuisineDao.getAllCuisineFromRestoId(restoid);
	}

	@Transactional
	@Override
	public RestoCuisineDetail AddCuisineWithRestoid(RestoCuisineDetail restoCuisineObj) {
		return cuisineDao.AddCuisineWithRestoid(restoCuisineObj);
	}

	@Transactional
	@Override
	public void deleteCuisine(RestoCuisineDetail restoCuisineObj) {
		cuisineDao.deleteCuisine(restoCuisineObj);
		
	}

}
