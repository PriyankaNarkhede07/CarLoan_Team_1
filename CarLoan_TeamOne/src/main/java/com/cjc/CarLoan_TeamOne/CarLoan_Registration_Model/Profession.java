package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Profession {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int professionid;
	String professiontype;
	double profession_income;
	String professionDesignation;
	@Lob
	byte[] profession_income_proof;
	
	public int getProfessionid() {
		return professionid;
	}
	public void setProfessionid(int professionid) {
		this.professionid = professionid;
	}
	public String getProfessiontype() {
		return professiontype;
	}
	public void setProfessiontype(String professiontype) {
		this.professiontype = professiontype;
	}
	public double getProfession_income() {
		return profession_income;
	}
	public void setProfession_income(double profession_income) {
		this.profession_income = profession_income;
	}
	public String getProfessionDesignation() {
		return professionDesignation;
	}
	public void setProfessionDesignation(String professionDesignation) {
		this.professionDesignation = professionDesignation;
	}
	public byte[] getProfession_income_proof() {
		return profession_income_proof;
	}
	public void setProfession_income_proof(byte[] profession_income_proof) {
		this.profession_income_proof = profession_income_proof;
	}
	
	
}
