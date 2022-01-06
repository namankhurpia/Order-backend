package com.namankhurpia.order.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateTime {
	
	public String getTodaysDateMonthYear()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now(); 
		return dtf.format(now);
	}
	
	public String getTodaysDateMonthYearTime()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now(); 
		return dtf.format(now);
	}
	
	public String getTodaysDateonly()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");  
		LocalDateTime now = LocalDateTime.now(); 
		return dtf.format(now);
	}

	public String getTodaysMonth()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");  
		LocalDateTime now = LocalDateTime.now(); 
		return dtf.format(now);
	}
	
	public String getTodaysYear()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");  
		LocalDateTime now = LocalDateTime.now(); 
		return dtf.format(now);
	}
	
}
