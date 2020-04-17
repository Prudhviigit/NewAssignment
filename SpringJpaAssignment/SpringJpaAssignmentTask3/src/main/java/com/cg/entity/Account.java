package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "cg_account")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Account {
	
	@Id
	@Column(name = "acc_id")
	private int accId;
	
	@Column(name = "cust_name", length = 25)
	private String custName;
	
	private double balance;
	
	public Account() {
	}
	
	public Account(int accId, String custName, double balance) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custName=" + custName + ", balance=" + balance + "]";
	}

}
