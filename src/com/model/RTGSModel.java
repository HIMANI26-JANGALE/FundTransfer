package com.model;

public class RTGSModel {
	private int fAccNo;
	private int bAccNo;
	private int bIFSCCode;
	private String bAccType;
	private float amt;
	private String remark;
	public int getfAccNo() {
		return fAccNo;
	}
	
	public RTGSModel() {
		
	}
	
	public RTGSModel(int fAccNo, int bAccNo, int bIFSCCode, String bAccType, float amt, String remark) {
		super();
		this.fAccNo = fAccNo;
		this.bAccNo = bAccNo;
		this.bIFSCCode = bIFSCCode;
		this.bAccType = bAccType;
		this.amt = amt;
		this.remark = remark;
	}
	public void setfAccNo(int fAccNo) {
		this.fAccNo = fAccNo;
	}
	public int getbAccNo() {
		return bAccNo;
	}
	public void setbAccNo(int bAccNo) {
		this.bAccNo = bAccNo;
	}
	public int getbIFSCCode() {
		return bIFSCCode;
	}
	public void setbIFSCCode(int bIFSCCode) {
		this.bIFSCCode = bIFSCCode;
	}
	public String getbAccType() {
		return bAccType;
	}
	public void setbAccType(String bAccType) {
		this.bAccType = bAccType;
	}
	public float getAmt() {
		return amt;
	}
	

	public void setAmt(float amt) {
		this.amt = amt;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "RTGSModel [fAccNo=" + fAccNo + ", bAccNo=" + bAccNo + ", bIFSCCode=" + bIFSCCode + ", bAccType="
				+ bAccType + ", amt=" + amt + ", remark=" + remark + "]";
	}
	
}
