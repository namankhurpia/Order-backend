package com.namankhurpia.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.order.model.RestoOwner;
import com.namankhurpia.order.service.RestoOwnerService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestoOwnerController {
	
	@Autowired
	private RestoOwnerService restoownerservice;
	
	@GetMapping("/")
	public String gethome() {
		return "<h1>HOME PAGE</h1>";
	}
	
	@GetMapping("/getall")
	public List<RestoOwner> getall() {
		List<RestoOwner> list = restoownerservice.getall();
		return list;
	}
	
	@GetMapping("/resto/{restoid}")
	public RestoOwner getrestoownerDetails(@PathVariable int restoid){
		 RestoOwner obj = restoownerservice.get(restoid);
		 if(obj==null) {
			 System.out.println("No restraunts found with id:"+restoid);
			 return null;
			}
		 else
		 {
			System.out.println("name is"+obj.getNameofresto());
			return obj;
		 }

	}
	
	@PostMapping("/restoowner")
	public RestoOwner save(@RequestBody RestoOwner restoowner_obj)
	{
		return restoownerservice.save(restoowner_obj);
	}
	
	@PutMapping("/restoowner")
	public RestoOwner update(@RequestBody RestoOwner restoowner_obj)
	{
		return restoownerservice.save(restoowner_obj);
	}
	
	@PostMapping("/restoownerdel")
	public String delete(@RequestBody RestoOwner restoowner_obj)
	{
		restoownerservice.delete(restoowner_obj);
		return "Resto deleted with id:"+restoowner_obj.getRestoid();
	}
	

}
