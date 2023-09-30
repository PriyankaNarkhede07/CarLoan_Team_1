package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PreviousLoanBank {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int previousLoanBankBranchId;
	private String previousLoanBankBranchName;
	private double previousLoanBankBranchCode;
	private String previousLoanBankBranchType;
	private String previousLoanBankIfsc;
	private String reviousLoanBankMicr;
	private  double previousLoanBankContactNumber;
	private String previousLoanBankAddress;
	private String previousLoanBankEmail;
	private String previousLoanBankStatus;
	
	public int getPreviousLoanBankBranchId() {
		return previousLoanBankBranchId;
	}
	public void setPreviousLoanBankBranchId(int previousLoanBankBranchId) {
		this.previousLoanBankBranchId = previousLoanBankBranchId;
	}
	public String getPreviousLoanBankBranchName() {
		return previousLoanBankBranchName;
	}
	public void setPreviousLoanBankBranchName(String previousLoanBankBranchName) {
		this.previousLoanBankBranchName = previousLoanBankBranchName;
	}
	public double getPreviousLoanBankBranchCode() {
		return previousLoanBankBranchCode;
	}
	public void setPreviousLoanBankBranchCode(double previousLoanBankBranchCode) {
		this.previousLoanBankBranchCode = previousLoanBankBranchCode;
	}
	public String getPreviousLoanBankBranchType() {
		return previousLoanBankBranchType;
	}
	public void setPreviousLoanBankBranchType(String previousLoanBankBranchType) {
		this.previousLoanBankBranchType = previousLoanBankBranchType;
	}
	public String getPreviousLoanBankIfsc() {
		return previousLoanBankIfsc;
	}
	public void setPreviousLoanBankIfsc(String previousLoanBankIfsc) {
		this.previousLoanBankIfsc = previousLoanBankIfsc;
	}
	public String getReviousLoanBankMicr() {
		return reviousLoanBankMicr;
	}
	public void setReviousLoanBankMicr(String reviousLoanBankMicr) {
		this.reviousLoanBankMicr = reviousLoanBankMicr;
	}
	public double getPreviousLoanBankContactNumber() {
		return previousLoanBankContactNumber;
	}
	public void setPreviousLoanBankContactNumber(double previousLoanBankContactNumber) {
		this.previousLoanBankContactNumber = previousLoanBankContactNumber;
	}
	public String getPreviousLoanBankAddress() {
		return previousLoanBankAddress;
	}
	public void setPreviousLoanBankAddress(String previousLoanBankAddress) {
		this.previousLoanBankAddress = previousLoanBankAddress;
	}
	public String getPreviousLoanBankEmail() {
		return previousLoanBankEmail;
	}
	public void setPreviousLoanBankEmail(String previousLoanBankEmail) {
		this.previousLoanBankEmail = previousLoanBankEmail;
	}
	public String getPreviousLoanBankStatus() {
		return previousLoanBankStatus;
	}
	public void setPreviousLoanBankStatus(String previousLoanBankStatus) {
		this.previousLoanBankStatus = previousLoanBankStatus;
	}
	 
	
	
	
}
