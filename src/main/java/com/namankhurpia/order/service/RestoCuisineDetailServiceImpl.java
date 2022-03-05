package com.namankhurpia.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.DAO.RestoCuisineDetailDAO;
import com.namankhurpia.order.model.txn.RestoCuisineDetails;

@Service
public class RestoCuisineDetailServiceImpl implements RestoCuisineDetailService{
	
	@Autowired
	RestoCuisineDetailDAO cuisineDao;

	@Override
	public List<RestoCuisineDetails> getAllCuisineFromRestoId(int restoid) {
		return cuisineDao.getAllCuisineFromRestoId(restoid);
	}

	@Override
	public RestoCuisineDetails AddCuisineWithRestoid(RestoCuisineDetails restoCuisineObj) {
		return cuisineDao.AddCuisineWithRestoid(restoCuisineObj);
	}

	@Override
	public void deleteCuisine(RestoCuisineDetails restoCuisineObj) {
		cuisineDao.deleteCuisine(restoCuisineObj);
		
	}

}
