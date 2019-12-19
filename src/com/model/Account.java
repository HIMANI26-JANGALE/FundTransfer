package com.model;

public class Account {
	private long account_no;
	private float account_balance;
	private int cust_id;
	private String branch_name;
	private int branch_code;
	private int ifsc_code;
	private int micr_code;
	private String account_type;
	public Account(){
		
	}
	public Account(long account_no, float account_balance, int cust_id, String branch_name, int branch_code,
			int ifsc_code, int micr_code, String account_type) {
		
		this.account_no = account_no;
		this.account_balance = account_balance;
		this.cust_id = cust_id;
		this.branch_name = branch_name;
		this.branch_code = branch_code;
		this.ifsc_code = ifsc_code;
		this.micr_code = micr_code;
		this.account_type = account_type;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public float getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(float account_balance) {
		this.account_balance = account_balance;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public int getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(int branch_code) {
		this.branch_code = branch_code;
	}
	public int getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public int getMicr_code() {
		return micr_code;
	}
	public void setMicr_code(int micr_code) {
		this.micr_code = micr_code;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
}
