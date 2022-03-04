package com.namankhurpia.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.order.model.txn.Transaction;
import com.namankhurpia.order.service.TransactionService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HomePageController {

	@Autowired
	private TransactionService transactionservice;
	
	@GetMapping("/gettodaystxn/{restoid}")
	public List<Transaction> getTodaysTxnForRestoUsingRestoID (@PathVariable int restoid)
	{
		return transactionservice.getTxnForRestoUsingRestoIDAndDate_today(restoid);
	}
	
	@GetMapping("/gettodaysearning/{restoid}")
	public String getTodaysEarningUsingRestoId (@PathVariable int restoid)
	{
		return transactionservice.getTodaysEarningUsingRestoID(restoid);
	}
	
	@GetMapping("/getmonthsearning/{restoid}")
	public String getMonthsEarningUsingRestoId (@PathVariable int restoid)
	{
		return transactionservice.getMonthsEarningUsingRestoID(restoid);
	}
	
}
