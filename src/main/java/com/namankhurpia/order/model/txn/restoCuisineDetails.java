package com.namankhurpia.order.model.txn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restocuisinedetails")
public class RestoCuisineDetails {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long cuisineid;
	
	@Column
	public int restoid;
	
	@Column
	public String cuisine;
	
	public RestoCuisineDetails() {
		
	}

	public RestoCuisineDetails(long cuisineid, int restoid, String cuisine) {
		super();
		this.cuisineid = cuisineid;
		this.restoid = restoid;
		this.cuisine = cuisine;
	}

	public long getCuisineid() {
		return cuisineid;
	}

	public void setCuisineid(long cuisineid) {
		this.cuisineid = cuisineid;
	}

	public int getRestoid() {
		return restoid;
	}

	public void setRestoid(int restoid) {
		this.restoid = restoid;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	@Override
	public String toString() {
		return "RestoCuisineDetails [cuisineid=" + cuisineid + ", restoid=" + restoid + ", cuisine=" + cuisine + "]";
	}
	
	
	


	
	

}
