package com.namankhurpia.order.DAO;

import java.util.List;

import com.namankhurpia.order.model.txn.RestoCuisineDetail;

public interface RestoCuisineDetailDAO {
	
	List<RestoCuisineDetail> getAllCuisineFromRestoId(int restoid);
	
	RestoCuisineDetail AddCuisineWithRestoid(RestoCuisineDetail restoCuisineObj);
	
	void deleteCuisine(RestoCuisineDetail restoCuisineObj);

}
