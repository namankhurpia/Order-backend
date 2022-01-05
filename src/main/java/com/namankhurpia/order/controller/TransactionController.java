package com.namankhurpia.order.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.order.model.Transaction;
import com.namankhurpia.order.service.TransactionService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionservice;
	
	@GetMapping("/getforresto/{restoid}")
	public List<Transaction> getforresto (@PathVariable int restoid)
	{
		List<Transaction> list = transactionservice.getforresto(restoid);
		return list;
	}
	
	@GetMapping("/gettodaystxn/{restoid}")
	public List<Transaction> getTodaysTxnForRestoUsingRestoID (@PathVariable int restoid)
	{
		return transactionservice.getTxnForRestoUsingRestoIDAndDate_today(restoid);
	}
	
	
	@PostMapping("/transaction")
	public Transaction addorupdateanewtransaction (@RequestBody Transaction transaction_obj)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		transaction_obj.setTimestamporder(dtf.format(now));
		return transactionservice.addorupdate(transaction_obj);
	}
	
	@PutMapping("/transaction")
	public Transaction update(@RequestBody Transaction transaction_obj)
	{
		return transactionservice.addorupdate(transaction_obj);
	}
	
	
}
