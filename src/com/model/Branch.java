package com.model;

public class Branch {
private int ifsc_code;
private String branch_name;
private String branch_code;
private float branch_bal;
  public Branch(){
	
  }
public Branch(int ifsc_code, String branch_name, String branch_code, float branch_bal) {
	
	this.ifsc_code = ifsc_code;
	this.branch_name = branch_name;
	this.branch_code = branch_code;
	this.branch_bal = branch_bal;
}
public int getIfsc_code() {
	return ifsc_code;
}
public void setIfsc_code(int ifsc_code) {
	this.ifsc_code = ifsc_code;
}
public String getBranch_name() {
	return branch_name;
}
public void setBranch_name(String branch_name) {
	this.branch_name = branch_name;
}
public String getBranch_code() {
	return branch_code;
}
public void setBranch_code(String branch_code) {
	this.branch_code = branch_code;
}
public float getBranch_bal() {
	return branch_bal;
}
public void setBranch_bal(float branch_bal) {
	this.branch_bal = branch_bal;
}
  
}
