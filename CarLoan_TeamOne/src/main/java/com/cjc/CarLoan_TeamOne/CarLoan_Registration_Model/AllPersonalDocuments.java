package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class AllPersonalDocuments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentID;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] salarySlips;
	
	public int getDocumentID() {
		return documentID;
	}
	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public byte[] getBankCheque() {
		return bankCheque;
	}
	public void setBankCheque(byte[] bankCheque) {
		this.bankCheque = bankCheque;
	}
	public byte[] getSalarySlips() {
		return salarySlips;
	}
	public void setSalarySlips(byte[] salarySlips) {
		this.salarySlips = salarySlips;
	}

	
	
}
