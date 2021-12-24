package com.namankhurpia.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menudetails")
public class Menu {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int itemid;
	
	@Column
	public String dishcuisine;
	
	@Column
	public String dishname;
	
	@Column
	public String dishdesc;
	
	@Column
	public int dishprice;
	
	@Column
	public boolean dishveg;
	
	@Column
	public int dishbelongresto;
	
	@Column
	public boolean isavailable;
	
	@Column
	public String ext1;
	
	public Menu() {
		
	}
	

	public Menu(int itemid, String dishcuisine, String dishname, String dishdesc, int dishprice, boolean dishveg,
			int dishbelongresto, boolean isavailable, String ext1) {
		super();
		this.itemid = itemid;
		this.dishcuisine = dishcuisine;
		this.dishname = dishname;
		this.dishdesc = dishdesc;
		this.dishprice = dishprice;
		this.dishveg = dishveg;
		this.dishbelongresto = dishbelongresto;
		this.isavailable = isavailable;
		this.ext1 = ext1;
	}


	public boolean isIsavailable() {
		return isavailable;
	}


	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}


	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getDishcuisine() {
		return dishcuisine;
	}

	public void setDishcuisine(String dishcuisine) {
		this.dishcuisine = dishcuisine;
	}

	public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

	public String getDishdesc() {
		return dishdesc;
	}

	public void setDishdesc(String dishdesc) {
		this.dishdesc = dishdesc;
	}

	public int getDishprice() {
		return dishprice;
	}

	public void setDishprice(int dishprice) {
		this.dishprice = dishprice;
	}

	public boolean isDishveg() {
		return dishveg;
	}

	public void setDishveg(boolean dishveg) {
		this.dishveg = dishveg;
	}

	public int getDishbelongresto() {
		return dishbelongresto;
	}

	public void setDishbelongresto(int dishbelongresto) {
		this.dishbelongresto = dishbelongresto;
	}

	
	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}
	
	

	

}
