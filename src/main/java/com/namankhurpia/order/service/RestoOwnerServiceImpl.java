package com.namankhurpia.order.service;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.RestoOwnerDAO;
import com.namankhurpia.order.model.RestoOwner;
import com.namankhurpia.order.utils.AES256;

@Service
public class RestoOwnerServiceImpl implements RestoOwnerService {
	
	@Autowired
	private RestoOwnerDAO restoownerdao;
	private AES256 aesobj;

	@Transactional
	@Override
	public RestoOwner get(int restoid) {
		return restoownerdao.getone(restoid);
	}

	@Transactional
	@Override
	public RestoOwner save(RestoOwner restoowner_obj) {
		return restoownerdao.save(restoowner_obj);
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
		int restoid = restoownerdao.findRestoownerIdFromEmail(email);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String textToEncrypt = restoid+ dtf.format(now) + email;
		
		String textAfterEncyrption =  aesobj.encrypt(textToEncrypt);
		
		String firstbit = (textAfterEncyrption.substring(0,1)==null) ? textAfterEncyrption.substring(0,1):"N" ;
		String secondbit = (textAfterEncyrption.substring(7,8)==null) ? textAfterEncyrption.substring(7,8):"N" ;
		String thirdbit = (textAfterEncyrption.substring(12,13)==null) ? textAfterEncyrption.substring(12,13):"N" ;
		String fourthbit = (textAfterEncyrption.substring(14,15)==null) ? textAfterEncyrption.substring(14,15):"N" ;
		String fifthbit = (textAfterEncyrption.substring(18,19)==null) ? textAfterEncyrption.substring(18,19):"N" ;
		String sixthbit = (textAfterEncyrption.substring(20,21)==null) ? textAfterEncyrption.substring(20,21):"N" ;
		
		String textToMatchChecksum = firstbit+secondbit+thirdbit+fourthbit+fifthbit+sixthbit;
		
				
		if(textToMatchChecksum.length()==6)
		{
			return textToMatchChecksum;
		}
		else
		{
			throw new RuntimeException("The business Logic in Enc Utility is not working as expected for:" + email);
		}
	}

}
