package com.model;

public class Account1 {
	private int accNo;
	private float accBal;
	private String accType;
	
	public Account1() {
		
	}
	
	public Account1(float accBal, String accType) {
		super();
		//this.accNo = accNo;
		this.accBal = accBal;
		this.accType = accType;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accBal=" + accBal + ", accType=" + accType + "]";
	}
}
