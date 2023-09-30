package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PreviousLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int previousLoanId;
	private double previousLoanAmount;
	private int previousLoanTenure;
	private double previousLoanPaidAmount;
	private double previousLoanRemainingAmount;
	private String previousLoanStatus;
 	private String previousLoanRemark;
 	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ForK_PreviousLoanBankBranchId")
	private PreviousLoanBank previousLoanBankDetails;

	public int getPreviousLoanId() {
		return previousLoanId;
	}

	public void setPreviousLoanId(int previousLoanId) {
		this.previousLoanId = previousLoanId;
	}

	public double getPreviousLoanAmount() {
		return previousLoanAmount;
	}

	public void setPreviousLoanAmount(double previousLoanAmount) {
		this.previousLoanAmount = previousLoanAmount;
	}

	public int getPreviousLoanTenure() {
		return previousLoanTenure;
	}

	public void setPreviousLoanTenure(int previousLoanTenure) {
		this.previousLoanTenure = previousLoanTenure;
	}

	public double getPreviousLoanPaidAmount() {
		return previousLoanPaidAmount;
	}

	public void setPreviousLoanPaidAmount(double previousLoanPaidAmount) {
		this.previousLoanPaidAmount = previousLoanPaidAmount;
	}

	public double getPreviousLoanRemainingAmount() {
		return previousLoanRemainingAmount;
	}

	public void setPreviousLoanRemainingAmount(double previousLoanRemainingAmount) {
		this.previousLoanRemainingAmount = previousLoanRemainingAmount;
	}

	public String getPreviousLoanStatus() {
		return previousLoanStatus;
	}

	public void setPreviousLoanStatus(String previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}

	public String getPreviousLoanRemark() {
		return previousLoanRemark;
	}

	public void setPreviousLoanRemark(String previousLoanRemark) {
		this.previousLoanRemark = previousLoanRemark;
	}

	public PreviousLoanBank getPreviousLoanBankDetails() {
		return previousLoanBankDetails;
	}

	public void setPreviousLoanBankDetails(PreviousLoanBank previousLoanBankDetails) {
		this.previousLoanBankDetails = previousLoanBankDetails;
	}
	
 	
 	 
	
}
