package com.namankhurpia.order.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.namankhurpia.order.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction , Integer>  {

	@Query(value = "SELECT * FROM trans t WHERE t.restoid = ?1", nativeQuery = true)
	List<Transaction> getforresto(int restoid);
	
	
}
