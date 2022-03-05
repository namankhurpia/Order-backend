package com.namankhurpia.order.service;

import java.util.List;

import com.namankhurpia.order.model.txn.RestoCuisineDetails;

public interface RestoCuisineDetailService {
	
	List<RestoCuisineDetails> getAllCuisineFromRestoId(int restoid);
	
	RestoCuisineDetails AddCuisineWithRestoid(RestoCuisineDetails restoCuisineObj);
	
	void deleteCuisine(RestoCuisineDetails restoCuisineObj);


}
