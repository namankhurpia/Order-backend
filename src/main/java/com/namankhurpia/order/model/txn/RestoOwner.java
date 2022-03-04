package com.namankhurpia.order.model.txn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "restoowner")
public class RestoOwner {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int restoid;
	
	@Column
	public String username;
	
	@Column
	public String nameofresto;
	
	@Column
	public String address;
	
	@Column
	public String gps;
	
	@Column
	public String phoneno;
	
	@Column
	public String email;
	
	@Column
	public int restonooftable;
	
	@Column
	public String restologourl;
	
	
	@Column
	public String datejoined;
	
	@Column
	public String renewdate;
	
	@Column
	public int isactivecode;
	
	@Column 
	public int planactive;
	
	@Column 
	public String gstin;
	

	public RestoOwner() {
		
	}


	public int getRestoid() {
		return restoid;
	}


	public void setRestoid(int restoid) {
		this.restoid = restoid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getNameofresto() {
		return nameofresto;
	}


	public void setNameofresto(String nameofresto) {
		this.nameofresto = nameofresto;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGps() {
		return gps;
	}


	public void setGps(String gps) {
		this.gps = gps;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getRestonooftable() {
		return restonooftable;
	}


	public void setRestonooftable(int restonooftable) {
		this.restonooftable = restonooftable;
	}


	public String getRestologourl() {
		return restologourl;
	}


	public void setRestologourl(String restologourl) {
		this.restologourl = restologourl;
	}


	public String getDatejoined() {
		return datejoined;
	}


	public void setDatejoined(String datejoined) {
		this.datejoined = datejoined;
	}


	public String getRenewdate() {
		return renewdate;
	}


	public void setRenewdate(String renewdate) {
		this.renewdate = renewdate;
	}


	public int getIsactivecode() {
		return isactivecode;
	}


	public void setIsactivecode(int isactivecode) {
		this.isactivecode = isactivecode;
	}


	public int getPlanactive() {
		return planactive;
	}


	public void setPlanactive(int planactive) {
		this.planactive = planactive;
	}


	public String getGstin() {
		return gstin;
	}


	public void setGstin(String gstin) {
		this.gstin = gstin;
	}


	public RestoOwner(int restoid, String username, String nameofresto, String address, String gps, String phoneno,
			String email, int restonooftable, String restologourl, String datejoined, String renewdate,
			int isactivecode, int planactive, String gstin) {
		super();
		this.restoid = restoid;
		this.username = username;
		this.nameofresto = nameofresto;
		this.address = address;
		this.gps = gps;
		this.phoneno = phoneno;
		this.email = email;
		this.restonooftable = restonooftable;
		this.restologourl = restologourl;
		this.datejoined = datejoined;
		this.renewdate = renewdate;
		this.isactivecode = isactivecode;
		this.planactive = planactive;
		this.gstin = gstin;
	}
	
	

	
	

	
}
