package com.namankhurpia.order.service;

import java.util.List;

import com.namankhurpia.order.model.txn.Transaction;

public interface TransactionService {
	
	List<Transaction> getforresto(int restoid);
	
	Transaction addorupdate(Transaction transaction_obj);

	List<Transaction> getTxnForRestoUsingRestoIDAndDate_today (int restoid);
	
	List<Transaction> GetTxnForRestoUsingRestoIdAndStartDateAndEndDate (int restoid, String startdate, String enddate);
	
	String getTodaysEarningUsingRestoID (int restoid);
	
	String getMonthsEarningUsingRestoID (int restoid);
	
}
