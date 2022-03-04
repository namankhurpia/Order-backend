package com.namankhurpia.order.model.txn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menudetails")
public class restoCuisineDetails {
	
	@Column
	public int restoid;
	
	@Column
	public String cuisine;
	

}
