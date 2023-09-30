package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Register_customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cust_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentLoanDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EMIDetails emiDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan previousLoan;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GarentorDetails garentorDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
	
	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public GarentorDetails getGarentorDetails() {
		return garentorDetails;
	}

	public void setGarentorDetails(GarentorDetails garentorDetails) {
		this.garentorDetails = garentorDetails;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public int getCust_Id() {
		return cust_Id;
	}

	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}

	public CurrentLoanDetails getCurrentLoanDetails() {
		return currentLoanDetails;
	}

	public void setCurrentLoanDetails(CurrentLoanDetails currentLoanDetails) {
		this.currentLoanDetails = currentLoanDetails;
	}

	public EMIDetails getEmiDetails() {
		return emiDetails;
	}

	public void setEmiDetails(EMIDetails emiDetails) {
		this.emiDetails = emiDetails;
	}

	public PreviousLoan getPreviousLoan() {
		return previousLoan;
	}

	public void setPreviousLoan(PreviousLoan previousLoan) {
		this.previousLoan = previousLoan;
	}

	 
	
	
	
	
	
}
