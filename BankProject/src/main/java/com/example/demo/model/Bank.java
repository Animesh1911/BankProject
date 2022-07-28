package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK")
public class Bank {

	@Id
	@Column(name = "ACCOUNT_NUMBER")
	private String accNum;
	
	@Column(name = "CUSTOMER_NAME")
	private String cName;
	
	@Column(name = "BALANCE")
	private int bal;

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Bank [accNum=" + accNum + ", cName=" + cName + ", bal=" + bal + "]";
	}

}
