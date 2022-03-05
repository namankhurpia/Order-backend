package com.namankhurpia.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.order.model.txn.RestoCuisineDetails;
import com.namankhurpia.order.model.txn.RestoOwner;
import com.namankhurpia.order.service.RestoCuisineDetailService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CuisineController {

	@Autowired
	RestoCuisineDetailService cuisineService;
	
	@GetMapping("/getCuisine/{restoid}")
	public List<RestoCuisineDetails> getAllCuisineFromRestoId (@PathVariable int restoid)
	{
		return cuisineService.getAllCuisineFromRestoId(restoid);
	}
	
	@PostMapping("/addcuisine")
	public RestoCuisineDetails save(@RequestBody RestoCuisineDetails cuisineObj)
	{
		return cuisineService.AddCuisineWithRestoid(cuisineObj);
	}
	
	@PostMapping("/deletecuisine")
	public String delete(@RequestBody RestoCuisineDetails cuisineObj)
	{
		cuisineService.deleteCuisine(cuisineObj);
		return "Cuisine:"+ cuisineObj.getCuisine()+" deleted with Restoid id:"+cuisineObj.getRestoid();
	}
	
	
	
	
}
