package com.namankhurpia.order.DAO;

public class FilterClass {
	
	int restoid;
	String startdate;
	String enddate;
	
	
	
	
	public int getRestoid() {
		return restoid;
	}
	public void setRestoid(int restoid) {
		this.restoid = restoid;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
	
	public FilterClass(int restoid, String startdate, String enddate) {
		super();
		this.restoid = restoid;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	@Override
	public String toString() {
		return "FilterClass [restoid=" + restoid + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	
	
	



}
