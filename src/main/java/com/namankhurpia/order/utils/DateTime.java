package com.namankhurpia.order.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
	
	public String get30daysfromtodaysdate()
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, +30);
		Date todayplus30 = cal.getTime();
		return simpleDateFormat.format(todayplus30);
		
	}
	
}
