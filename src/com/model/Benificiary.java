package com.model;

public class Benificiary {
	private int benfiNo;
	private static int series=1000;
	private int accNo;
	private String accType;
	private int ifscNo;
	private String benefiName;
	private String emailId;
	
	
	
	public Benificiary( int accNo,  String accType,int ifscNo, String benefiName, String emailId) {
		this.benfiNo = series;
		series++;
		this.accNo = accNo;
		this.ifscNo = ifscNo;
		this.accType = accType;
		this.benefiName = benefiName;
		this.emailId = emailId;
	}

  

public int getBenfiNo() {
		return benfiNo;
	}
  
   public void setBenfiNo(int benfiNo) {
		this.benfiNo = benfiNo;
	}
   
   public int getAccNo() {
		return accNo;
	}
   
   public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

    public int getIfscNo() {
		return ifscNo;
	}

    public void setIfscNo(int ifscNo) {
		this.ifscNo = ifscNo;
	}

   public String getAccType() {
		return accType;
	}
    
   public void setAccType(String accType) {
		this.accType = accType;
	}
   
   public String getBenefiName() {
		return benefiName;
	}

   public void setBenefiName(String benefiName) {
		this.benefiName = benefiName;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Benificiary [benfiNo=" + benfiNo + ", accNo=" + accNo + ", ifscNo=" + ifscNo + ", accType=" + accType
				+ ", benefiName=" + benefiName + ", emailId=" + emailId + "]";
	}
	
	
}
