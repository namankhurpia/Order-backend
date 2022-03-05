package com.namankhurpia.order.DAO;

import java.util.List;

import com.namankhurpia.order.model.txn.RestoCuisineDetails;

public interface RestoCuisineDetailDAO {
	
	List<RestoCuisineDetails> getAllCuisineFromRestoId(int restoid);
	
	RestoCuisineDetails AddCuisineWithRestoid(RestoCuisineDetails restoCuisineObj);
	
	void deleteCuisine(RestoCuisineDetails restoCuisineObj);

}
