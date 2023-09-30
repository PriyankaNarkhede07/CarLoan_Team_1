package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EMIDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiId;
	private double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;
	
	public int getEmiId() {
		return emiId;
	}
	public void setEmiId(int emiId) {
		this.emiId = emiId;
	}
	public double getEmiAmountMonthly() {
		return emiAmountMonthly;
	}
	public void setEmiAmountMonthly(double emiAmountMonthly) {
		this.emiAmountMonthly = emiAmountMonthly;
	}
	public String getNextEmiDueDate() {
		return nextEmiDueDate;
	}
	public void setNextEmiDueDate(String nextEmiDueDate) {
		this.nextEmiDueDate = nextEmiDueDate;
	}
	public String getPreviousEmiStatus() {
		return previousEmiStatus;
	}
	public void setPreviousEmiStatus(String previousEmiStatus) {
		this.previousEmiStatus = previousEmiStatus;
	}
	
}
