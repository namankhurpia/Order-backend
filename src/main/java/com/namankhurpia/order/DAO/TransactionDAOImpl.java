package com.namankhurpia.order.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.model.Transaction;
import com.namankhurpia.order.repos.TransactionRepo;

@Service
public class TransactionDAOImpl implements TransactionDAO {

	@Autowired
	TransactionRepo txnrepo;


	@Override
	public List<Transaction> getforresto(int restoid) {
		return txnrepo.getforresto(restoid);
	}

	@Override
	public Transaction addorUpdateAnewtransaction(Transaction transaction_obj) {
		return txnrepo.save(transaction_obj);
	}

	@Override
	public List<Transaction> getTxnForRestoUsingRestoIDAndDate_today(int restoid, String date) {
		return txnrepo.getTxnForRestoUsingRestoIDAndDate(restoid, date);
	}

	@Override
	public String getTodaysEarningUsingRestoID(int restoid, String date) {
		return txnrepo.getTodaysEarningUsingRestoID(restoid, date);
	}

	@Override
	public String getMonthsEarningUsingRestoID(int restoid, String month, String year) {
		return txnrepo.getMonthsEarningUsingRestoID(restoid, month, year);
	}

	@Override
	public List<Transaction> GetTxnForRestoUsingRestoIdAndStartDateAndEndDate(int restoid, String startdate,String enddate) {
		return txnrepo.GetTxnForRestoUsingRestoIdAndStartDateAndEndDate(restoid, startdate, enddate);
	}
	
	



}
