package com.namankhurpia.order.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.namankhurpia.order.model.txn.RestoCuisineDetails;


@Repository
public interface RestoCuisineDetailsRepo extends JpaRepository < RestoCuisineDetails, Long>{
	
	@Query(value = "SELECT * FROM restocuisinedetails r WHERE r.restoid = ?1", nativeQuery = true)
	List<RestoCuisineDetails> getAllCuisineFromRestoId(int restoid);

}
