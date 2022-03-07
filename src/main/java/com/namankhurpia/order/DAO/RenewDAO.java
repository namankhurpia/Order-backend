package com.namankhurpia.order.DAO;

import com.namankhurpia.order.model.txn.Renew;

public interface RenewDAO {
	
	Renew getProperties(int restoid);
	
	Renew updateProperties(Renew renwObj);
	
	Renew save(Renew renwObj);
	
	void delete(Renew renwObj);

}
