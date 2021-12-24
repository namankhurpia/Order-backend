package com.namankhurpia.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.TransactionDAO;
import com.namankhurpia.order.model.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionDAO transactiondao;

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


}
