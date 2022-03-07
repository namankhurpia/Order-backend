package com.namankhurpia.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.RenewDAO;
import com.namankhurpia.order.model.txn.Renew;

@Service
public class RenewServiceImpl implements RenewService{
	
	@Autowired
	RenewDAO renewdao;

	@Transactional
	@Override
	public Renew getProperties(int restoid) {
		return renewdao.getProperties(restoid);
	}

	@Transactional
	@Override
	public Renew updateProperties(Renew renwObj) {
		return renewdao.updateProperties(renwObj);
	}

	@Transactional
	@Override
	public Renew save(Renew renwObj) {
		return renewdao.save(renwObj);
	}

	@Transactional
	@Override
	public void delete(Renew renwObj) {
		renewdao.delete(renwObj);
	}

}
