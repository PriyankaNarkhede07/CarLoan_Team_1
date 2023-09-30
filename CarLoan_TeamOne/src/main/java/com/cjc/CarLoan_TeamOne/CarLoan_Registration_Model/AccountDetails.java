package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int accountId;
	String accounType;
	double accountBalance;
	String accountHolderName;
	String accountStatus;
	long accountNumber;
	String accountIFSCcode;
	String bankname;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccounType() {
		return accounType;
	}
	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountIFSCcode() {
		return accountIFSCcode;
	}
	public void setAccountIFSCcode(String accountIFSCcode) {
		this.accountIFSCcode = accountIFSCcode;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	
}
