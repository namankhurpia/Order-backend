package com.namankhurpia.order.DAO;

import java.util.List;

import com.namankhurpia.order.model.Transaction;

public interface TransactionDAO {

	List<Transaction> getforresto(int restoid);
	
	Transaction addorUpdateAnewtransaction(Transaction transaction_obj);
	
	List<Transaction> getTxnForRestoUsingRestoIDAndDate_today (int restoid, String date);
	
	List<Transaction> GetTxnForRestoUsingRestoIdAndStartDateAndEndDate (int restoid, String startdate, String enddate);
	
	String getTodaysEarningUsingRestoID (int restoid, String date);
	
	String getMonthsEarningUsingRestoID (int restoid, String month, String year);
	
}
