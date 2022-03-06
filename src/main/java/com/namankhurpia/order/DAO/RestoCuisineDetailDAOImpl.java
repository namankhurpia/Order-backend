package com.namankhurpia.order.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.model.txn.RestoCuisineDetail;
import com.namankhurpia.order.repos.RestoCuisineDetailsRepo;

@Service
public class RestoCuisineDetailDAOImpl  implements RestoCuisineDetailDAO{
	
	@Autowired
	RestoCuisineDetailsRepo cuisineRepo;

	@Override
	public List<RestoCuisineDetail> getAllCuisineFromRestoId(int restoid) {
		return cuisineRepo.getAllCuisineFromRestoId(restoid);
	}

	
	@Override
	public void deleteCuisine(RestoCuisineDetail restoCuisineObj) {
		cuisineRepo.delete(restoCuisineObj);
	}


	@Override
	public RestoCuisineDetail AddCuisineWithRestoid(RestoCuisineDetail restoCuisineObj) {
		return cuisineRepo.save(restoCuisineObj);
	}

}
