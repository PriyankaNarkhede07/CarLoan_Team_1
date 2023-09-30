package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class CustomerAddress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int customerAddressId;
	@OneToOne(cascade = CascadeType.ALL)
	PermanentAddress permanentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	LocalAddress localAddress;

	@Lob
	byte[] aadharcard,pancard,voter_id,passport;

	public int getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(int customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public LocalAddress getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(LocalAddress localAddress) {
		this.localAddress = localAddress;
	}

	public byte[] getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(byte[] aadharcard) {
		this.aadharcard = aadharcard;
	}

	public byte[] getPancard() {
		return pancard;
	}

	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}

	public byte[] getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(byte[] voter_id) {
		this.voter_id = voter_id;
	}

	public byte[] getPassport() {
		return passport;
	}

	public void setPassport(byte[] passport) {
		this.passport = passport;
	}

}
