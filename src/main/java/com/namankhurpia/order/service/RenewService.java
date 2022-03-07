package com.namankhurpia.order.service;

import com.namankhurpia.order.model.txn.Renew;

public interface RenewService {

	Renew getProperties(int restoid);
	
	Renew updateProperties(Renew renwObj);
	
	Renew save(Renew renwObj);
	
	void delete(Renew renwObj);
}
