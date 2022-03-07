package com.namankhurpia.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.order.model.txn.Renew;
import com.namankhurpia.order.service.RenewService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController  
public class RenewController {

	@Autowired
	RenewService renewservice;
	
	@GetMapping("/renew/{restoid}")
	public Renew GetProperies (@PathVariable int restoid)
	{
		return renewservice.getProperties(restoid);
	}
	
	@PostMapping("/renew")
	public Renew Save(@RequestBody Renew renewObj)
	{
		return renewservice.save(renewObj);
	}
	
	@PutMapping("/renew")
	public Renew Update(@RequestBody Renew renewObj)
	{
		return renewservice.save(renewObj);
	}
	
	@DeleteMapping("/renew/del")
	public String Deleteitem(@RequestBody Renew renewObj)
	{
		try{
			renewservice.delete(renewObj);
			return "Goodjob!";
		}
		catch(Exception e)
		{
			System.out.println("stacktrace"+e.getStackTrace());
			return "Exception caught at "+e.getStackTrace();
		}
	}
}
