package com.namankhurpia.order.service;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.RestoOwnerDAO;
import com.namankhurpia.order.model.txn.Renew;
import com.namankhurpia.order.model.txn.RestoOwner;
import com.namankhurpia.order.utils.AES256;
import com.namankhurpia.order.utils.DateTime;
import com.namankhurpia.order.utils.Validators;

@Service
public class RestoOwnerServiceImpl implements RestoOwnerService {
	
	@Autowired
	private RestoOwnerDAO restoownerdao;
	
	@Autowired
	private AES256 aesobj;
	
	@Autowired
	private Validators validators;
	
	@Autowired
	private DateTime datetime;
	
	@Autowired
	private RenewService renewservice;

	@Transactional
	@Override
	public RestoOwner get(int restoid) {
		return restoownerdao.getone(restoid);
	}

	@Transactional
	@Override
	public RestoOwner save(RestoOwner restoowner_obj) {
		if(!validators.is_valid_email(restoowner_obj))
		{
			 System.out.println("VALIDATOR LOG - used email" + restoowner_obj.toString());
			 empty_up_the_object(restoowner_obj);
			 restoowner_obj.setEmail("USED EMAIL!");
			 return restoowner_obj;
		}
		else if(!validators.is_valid_phone(restoowner_obj))
		{
			System.out.println("VALIDATOR LOG - used phone" + restoowner_obj.toString());
			empty_up_the_object(restoowner_obj);
			restoowner_obj.setPhoneno("USED PHONE NUMBER!");
			return restoowner_obj;
		}
		else
		{
			restoowner_obj.setDatejoined(datetime.getTodaysDateMonthYearTime());
			//add a renew table entry
			renewservice.save(new Renew(restoowner_obj.getRestoid(),datetime.get30daysfromtodaysdate(), datetime.getTodaysDateMonthYearTime(), 1001 , 101 ) );
			return restoownerdao.save(restoowner_obj);
		}
		
	}
	
	public void empty_up_the_object(RestoOwner restoowner_obj)
	{
		restoowner_obj.setAddress(null);
		restoowner_obj.setEmail(null);
		restoowner_obj.setGps(null);
		restoowner_obj.setNameofresto(null);
		restoowner_obj.setPhoneno(null);
		restoowner_obj.setRestoid(0);
		restoowner_obj.setRestologourl(null);
		restoowner_obj.setRestonooftable(0);
		restoowner_obj.setUsername(null);
		
		
	}


	@Transactional
	@Override
	public void delete(RestoOwner restoowner_obj) {
		restoownerdao.delete(restoowner_obj);
	}

	@Transactional
	@Override
	public List<RestoOwner> getall() {
		return restoownerdao.getall();
	}

	@Override
	public String VerifyLogin(String email) throws NoSuchAlgorithmException {
		
		System.out.println("Finding resto id from email:"+email);
		
		String restoid = restoownerdao.findRestoownerIdFromEmail(email);
		
		System.out.println("result from repo:" +restoid);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now();  
		String textToEncrypt = restoid+ dtf.format(now) + email;
		
		System.out.println("text before encryption is: "+textToEncrypt);
		
		String textAfterEncyrption =  aesobj.encrypt(textToEncrypt);
		
		System.out.println("text after encryption is: "+textAfterEncyrption);
		
		String firstbit = (textAfterEncyrption.substring(0,1)!=null) ? textAfterEncyrption.substring(0,1):"N" ;
		String secondbit = (textAfterEncyrption.substring(7,8)!=null) ? textAfterEncyrption.substring(7,8):"N" ;
		String thirdbit = (textAfterEncyrption.substring(12,13)!=null) ? textAfterEncyrption.substring(12,13):"N" ;
		String fourthbit = (textAfterEncyrption.substring(14,15)!=null) ? textAfterEncyrption.substring(14,15):"N" ;
		String fifthbit = (textAfterEncyrption.substring(18,19)!=null) ? textAfterEncyrption.substring(18,19):"N" ;
		String sixthbit = (textAfterEncyrption.substring(20,21)!=null) ? textAfterEncyrption.substring(20,21):"N" ;
		
		String textToMatchChecksum = firstbit+secondbit+thirdbit+fourthbit+fifthbit+sixthbit;
		
		System.out.println("the checksum is: "+textToMatchChecksum.toUpperCase());
				
		if(textToMatchChecksum.length()==6)
		{
			return textToMatchChecksum.toUpperCase();
		}
		else
		{
			throw new RuntimeException("The business Logic in Enc Utility is not working as expected for:" + email);
		}
	}

	@Override
	public RestoOwner checkIfUserExists(RestoOwner restoowner_obj) {
		if(validators.CheckIfUserExistsUsingEmail(restoowner_obj))
		{
			//yes user exists
			return validators.getUserFromEmail(restoowner_obj);
		}
		else
		{
			//user not exists - create user
			empty_up_the_object(restoowner_obj);
			restoowner_obj.setEmail("USER DOES NOT EXIST");
			return restoowner_obj;
		}
	}

}
