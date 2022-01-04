package com.namankhurpia.order.model;

public class Login {
	
	String email;
	String checksum;
	public Login(String email, String checksum) {
		super();
		this.email = email;
		this.checksum = checksum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	
	public Login() {
		
	}

}
