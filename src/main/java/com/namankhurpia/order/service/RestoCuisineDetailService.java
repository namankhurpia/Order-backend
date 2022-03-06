package com.namankhurpia.order.service;

import java.util.List;

import com.namankhurpia.order.model.txn.RestoCuisineDetail;

public interface RestoCuisineDetailService {
	
	List<RestoCuisineDetail> getAllCuisineFromRestoId(int restoid);
	
	RestoCuisineDetail AddCuisineWithRestoid(RestoCuisineDetail restoCuisineObj);
	
	void deleteCuisine(RestoCuisineDetail restoCuisineObj);


}
