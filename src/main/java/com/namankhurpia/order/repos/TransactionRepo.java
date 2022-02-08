package com.namankhurpia.order.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.namankhurpia.order.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction , Integer>  {

	//get all resto orders - arranged chronologically
	@Query(value = "SELECT * FROM trans t WHERE t.restoid = ?1 ORDER BY TIME(timestamporder) DESC", nativeQuery = true)
	List<Transaction> getforresto(int restoid);
	
	//-------------NO USE-----------------//
	
	
	//get txn using restoid and startdate and enddate
	@Query(value = "SELECT * FROM trans t WHERE t.restoid = ?1 AND DATE(timestamporder) BETWEEN ?2 AND ?3 ORDER BY t.timestamporder DESC", nativeQuery = true)
	List<Transaction> GetTxnForRestoUsingRestoIdAndStartDateAndEndDate(int restoid, String startdate, String enddate);
	
	
	//get txn usig restoid and date - arranged chronologically
	@Query(value = "SELECT * FROM trans t WHERE t.restoid = ?1 AND DATE(timestamporder) = ?2 ORDER BY t.timestamporder DESC", nativeQuery = true)
	List<Transaction> getTxnForRestoUsingRestoIDAndDate (int restoid, String date);
	
	
	//Today's earning
	@Query(value = "SELECT SUM(amount) FROM trans t WHERE t.restoid = ?1 and DATE(t.timestamporder) = ?2", nativeQuery = true)
	String getTodaysEarningUsingRestoID(int restoid,String date);
	
	
	//Month's earning
	@Query(value = "SELECT SUM(amount) FROM trans t WHERE t.restoid = ?1 and MONTH(t.timestamporder) = ?2 and YEAR(t.timestamporder) = ?3", nativeQuery = true)
	String getMonthsEarningUsingRestoID(int restoid,String month, String year);
}
