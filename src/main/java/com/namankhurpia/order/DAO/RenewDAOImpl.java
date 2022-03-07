package com.namankhurpia.order.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namankhurpia.order.model.txn.Renew;
import com.namankhurpia.order.repos.RenewRepo;

@Service
public class RenewDAOImpl implements RenewDAO {
	
	@Autowired
	RenewRepo renewrepo;

	@Override
	public Renew getProperties(int restoid) {
		return renewrepo.getOne(restoid);
	}

	@Override
	public Renew updateProperties(Renew renewObj) {
		return renewrepo.save(renewObj);
	}

	@Override
	public Renew save(Renew renewObj) {
		return renewrepo.save(renewObj);
	}

	@Override
	public void delete(Renew renewObj) {
		renewrepo.delete(renewObj);
		
	}

}
