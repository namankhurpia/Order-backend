package com.namankhurpia.order.model.txn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "renew")
public class Renew {
	
	@Id
	@Column
	public int restoid;
	
	@Column
	public String renewdate;
	
	@Column
	public String lastpurchasedate;
	
	@Column
	public int activecode;
	
	@Column
	public int planactive;
	
	public Renew() {
		
	}

	public Renew(int restoid, String renewdate, String lastpurchasedate, int activecode, int planactive) {
		super();
		this.restoid = restoid;
		this.renewdate = renewdate;
		this.lastpurchasedate = lastpurchasedate;
		this.activecode = activecode;
		this.planactive = planactive;
	}

	@Override
	public String toString() {
		return "Renew [restoid=" + restoid + ", renewdate=" + renewdate + ", lastpurchasedate=" + lastpurchasedate
				+ ", activecode=" + activecode + ", planactive=" + planactive + "]";
	}

	public int getRestoid() {
		return restoid;
	}

	public void setRestoid(int restoid) {
		this.restoid = restoid;
	}

	public String getRenewdate() {
		return renewdate;
	}

	public void setRenewdate(String renewdate) {
		this.renewdate = renewdate;
	}

	public String getLastpurchasedate() {
		return lastpurchasedate;
	}

	public void setLastpurchasedate(String lastpurchasedate) {
		this.lastpurchasedate = lastpurchasedate;
	}

	public int getActivecode() {
		return activecode;
	}

	public void setActivecode(int activecode) {
		this.activecode = activecode;
	}

	public int getPlanactive() {
		return planactive;
	}

	public void setPlanactive(int planactive) {
		this.planactive = planactive;
	}

	


	

}
