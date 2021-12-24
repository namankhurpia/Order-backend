package com.namankhurpia.order.service;

import java.util.List;

import com.namankhurpia.order.model.Transaction;

public interface TransactionService {
	
	List<Transaction> getforresto(int restoid);
	
	Transaction addorupdate(Transaction transaction_obj);

	
}
