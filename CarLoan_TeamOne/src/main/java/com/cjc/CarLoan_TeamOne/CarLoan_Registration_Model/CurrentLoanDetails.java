package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrentLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int currentloanId;
	private int currentloanNo;
	private double required_loanAmount;
	private int rateOfIntrest;
	private int tenure;
	private double down_payment;
	private String status;
	
	public int getCurrentloanId() {
		return currentloanId;
	}
	public void setCurrentloanId(int currentloanId) {
		this.currentloanId = currentloanId;
	}
	public int getCurrentloanNo() {
		return currentloanNo;
	}
	public void setCurrentloanNo(int currentloanNo) {
		this.currentloanNo = currentloanNo;
	}
	public double getRequired_loanAmount() {
		return required_loanAmount;
	}
	public void setRequired_loanAmount(double required_loanAmount) {
		this.required_loanAmount = required_loanAmount;
	}
	public int getRateOfIntrest() {
		return rateOfIntrest;
	}
	public void setRateOfIntrest(int rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getDown_payment() {
		return down_payment;
	}
	public void setDown_payment(double down_payment) {
		this.down_payment = down_payment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
