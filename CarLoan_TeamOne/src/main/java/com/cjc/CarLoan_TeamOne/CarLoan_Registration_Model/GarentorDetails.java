package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GarentorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int garentorrId;
	String garentorName;
	String garentorDateOfBirth;
	String guarantorRelationshipwithCustomer;
	long garentorMobileNumber;
	long garentorAdharCardNo;
	String garentorJobDetails;
	String garentorLoaclAddress;
	String garentorPermanentAddress;
	
	public int getGarentorrId() {
		return garentorrId;
	}
	public void setGarentorrId(int garentorrId) {
		this.garentorrId = garentorrId;
	}
	public String getGarentorName() {
		return garentorName;
	}
	public void setGarentorName(String garentorName) {
		this.garentorName = garentorName;
	}
	public String getGarentorDateOfBirth() {
		return garentorDateOfBirth;
	}
	public void setGarentorDateOfBirth(String garentorDateOfBirth) {
		this.garentorDateOfBirth = garentorDateOfBirth;
	}
	public String getGuarantorRelationshipwithCustomer() {
		return guarantorRelationshipwithCustomer;
	}
	public void setGuarantorRelationshipwithCustomer(String guarantorRelationshipwithCustomer) {
		this.guarantorRelationshipwithCustomer = guarantorRelationshipwithCustomer;
	}
	public long getGarentorMobileNumber() {
		return garentorMobileNumber;
	}
	public void setGarentorMobileNumber(long garentorMobileNumber) {
		this.garentorMobileNumber = garentorMobileNumber;
	}
	public long getGarentorAdharCardNo() {
		return garentorAdharCardNo;
	}
	public void setGarentorAdharCardNo(long garentorAdharCardNo) {
		this.garentorAdharCardNo = garentorAdharCardNo;
	}
	public String getGarentorJobDetails() {
		return garentorJobDetails;
	}
	public void setGarentorJobDetails(String garentorJobDetails) {
		this.garentorJobDetails = garentorJobDetails;
	}
	public String getGarentorLoaclAddress() {
		return garentorLoaclAddress;
	}
	public void setGarentorLoaclAddress(String garentorLoaclAddress) {
		this.garentorLoaclAddress = garentorLoaclAddress;
	}
	public String getGarentorPermanentAddress() {
		return garentorPermanentAddress;
	}
	public void setGarentorPermanentAddress(String garentorPermanentAddress) {
		this.garentorPermanentAddress = garentorPermanentAddress;
	}
	
	
}
