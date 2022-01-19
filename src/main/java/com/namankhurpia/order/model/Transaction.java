package com.namankhurpia.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "trans")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int trid;
	
	@Column
	public String userphone; 	
	
	@Column
	public int restoid; 
	
	@Column
	public int amount ;
	
	@Column
	public String timestamporder; 
	
	@Column
	public String contents;
	
	@Column
	public int tableno;
	
	@Column
	public String orderstatus;
	
	@Column
	public String specialinstructions;
	
	@Column
	public String paymentdone;
	
	public Transaction() {
		
	}

	
	

	public Transaction(int trid, String userphone, int restoid, int amount, String timestamporder, String contents,
			int tableno, String orderstatus, String specialinstructions, String paymentdone) {
		super();
		this.trid = trid;
		this.userphone = userphone;
		this.restoid = restoid;
		this.amount = amount;
		this.timestamporder = timestamporder;
		this.contents = contents;
		this.tableno = tableno;
		this.orderstatus = orderstatus;
		this.specialinstructions = specialinstructions;
		this.paymentdone = paymentdone;
	}




	public String getTimestamporder() {
		return timestamporder;
	}




	public void setTimestamporder(String timestamporder) {
		this.timestamporder = timestamporder;
	}




	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}


	public int getTrid() {
		return trid;
	}

	public void setTrid(int trid) {
		this.trid = trid;
	}


	public int getRestoid() {
		return restoid;
	}

	public void setRestoid(int restoid) {
		this.restoid = restoid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getTableno() {
		return tableno;
	}

	public void setTableno(int tableno) {
		this.tableno = tableno;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getSpecialinstructions() {
		return specialinstructions;
	}

	public void setSpecialinstructions(String specialinstructions) {
		this.specialinstructions = specialinstructions;
	}

	public String getPaymentdone() {
		return paymentdone;
	}

	public void setPaymentdone(String paymentdone) {
		this.paymentdone = paymentdone;
	}

	

	

}
