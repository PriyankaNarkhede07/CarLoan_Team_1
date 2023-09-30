package com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParmenantAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int permanentAddressId;
    private String areaname;
    private String cityname;
    private String district;
    private String state;
    private int houseNumber;
	private String streetName;
    private int pincode;
    
	public int getPermanentAddressId() {
		return permanentAddressId;
	}
	public void setPermanentAddressId(int permanentAddressId) {
		this.permanentAddressId = permanentAddressId;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
