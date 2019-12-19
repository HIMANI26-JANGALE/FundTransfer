package com.model;
import java.sql.Date;

public class Application {
	private int cust_id;
	private String branch_name;
	private String account_type;
	private String surname;
	private String firtsname;
	private String middlename;
	private String date;
	private String mother_name;
	private String email;
	private String mobile_no;
	private String nationality;
	private String occupation;
	private String city;
	private String state;
	private String district;
	private int pincode;
	private String aadhar_no;
	private int pan_no;
	public Application()
	{
		
	}
	public Application(int cust_id, String branch_name, String account_type, String surname, String firtsname,
			String middlename, String date, String mother_name, String email, String mobile_no, String nationality,
			String occupation, String city, String state, String district, int pincode, String aadhar_no, int pan_no) {
		super();
		this.cust_id = cust_id;
		this.branch_name = branch_name;
		this.account_type = account_type;
		this.surname = surname;
		this.firtsname = firtsname;
		this.middlename = middlename;
		this.date = date;
		this.mother_name = mother_name;
		this.email = email;
		this.mobile_no = mobile_no;
		this.nationality = nationality;
		this.occupation = occupation;
		this.city = city;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.aadhar_no = aadhar_no;
		this.pan_no = pan_no;
	}
	public int getcust_id() {
		return cust_id;
	}
	public void setcust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirtsname() {
		return firtsname;
	}
	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public int getPan_no() {
		return pan_no;
	}
	public void setPan_no(int pan_no) {
		this.pan_no = pan_no;
	}
	
}
