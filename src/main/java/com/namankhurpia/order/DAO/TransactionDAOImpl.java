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



}