package com.namankhurpia.order.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.model.RestoOwner;
import com.namankhurpia.order.repos.RestoOwnerRepo;

@Service
public class RestoOwnerDAOImpl implements RestoOwnerDAO {
	
	@Autowired
	private RestoOwnerRepo restorepo;

	@Override
	public RestoOwner getone(int phoneno) {
		return restorepo.findOnerestoDetails(phoneno);
	}

	@Override
	public RestoOwner save(RestoOwner restoowner_obj) {
		return restorepo.save(restoowner_obj);
	}

	@Override
	public void delete(RestoOwner restoowner_obj) {
		restorepo.delete(restoowner_obj);
	}

	@Override
	public List<RestoOwner> getall() {
		return restorepo.findAll();
	}

	@Override
	public int findRestoownerIdFromEmail(String email) {
		return restorepo.findRestoownerIdFromEmail(email);
	}

	

}
