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

import com.namankhurpia.order.model.Menu;
import com.namankhurpia.order.service.MenuService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController  
public class MenuController {

	
	@Autowired
	MenuService menuservice;
	
	@GetMapping("/menu/{restoid}")
	public List<Menu> getRestrauntMenu(@PathVariable int restoid){	
		return menuservice.getall(restoid);
	}
	
	@GetMapping("/menu/allcuisine/{restoid}")
	public List<String> getRestrauntMenuCusine(@PathVariable int restoid){	
		return menuservice.getAllCuisineFromRestoid(restoid);
	}
	
	@GetMapping("/menu/{restoid}/{cuisinename}")
	public List<Menu> getAllItemsInCuisineFromCuisineNameAndRestoId (@PathVariable int restoid, @PathVariable String cuisinename)
	{
		return menuservice.getMenuItemsbyRestoIdAndCuisine(restoid, cuisinename);
	}
	
	@PostMapping("/menu")
	public Menu Save(@RequestBody Menu menu)
	{
		return menuservice.save(menu);
	}
	
	@PutMapping("/menu")
	public Menu Update(@RequestBody Menu menu)
	{
		return menuservice.save(menu);
	}
	
	@DeleteMapping("/menu/del")
	public String Deleteitem(@RequestBody Menu menu)
	{
		try{
			menuservice.delete(menu);
			return "Goodjob!";
		}
		catch(Exception e)
		{
			System.out.println("stacktrace"+e.getStackTrace());
			return "Exception caught at "+e.getStackTrace();
		}
	}
}
