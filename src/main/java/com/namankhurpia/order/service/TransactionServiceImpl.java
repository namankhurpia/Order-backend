package com.namankhurpia.order.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.TransactionDAO;
import com.namankhurpia.order.model.Transaction;
import com.namankhurpia.order.utils.DateTime;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionDAO transactiondao;
	
	@Autowired
	private DateTime dt;

	@Transactional
	@Override
	public List<Transaction> getforresto(int restoid) {
		return transactiondao.getforresto(restoid);
	}

	@Transactional
	@Override
	public Transaction addorupdate(Transaction transaction_obj) {
		return transactiondao.addorUpdateAnewtransaction(transaction_obj);
	}

	@Override
	public List<Transaction> getTxnForRestoUsingRestoIDAndDate_today(int restoid) {
		return transactiondao.getTxnForRestoUsingRestoIDAndDate_today(restoid,dt.getTodaysDateMonthYear());
	}

	@Override
	public String getTodaysEarningUsingRestoID(int restoid) {
		return transactiondao.getTodaysEarningUsingRestoID(restoid, dt.getTodaysDateMonthYear());
	}

	@Override
	public String getMonthsEarningUsingRestoID(int restoid) {
		return transactiondao.getMonthsEarningUsingRestoID(restoid, dt.getTodaysMonth(), dt.getTodaysYear());
	}


}
