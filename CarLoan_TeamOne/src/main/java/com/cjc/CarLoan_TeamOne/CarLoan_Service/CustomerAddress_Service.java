package com.cjc.CarLoan_TeamOne.CarLoan_Service;

import java.util.List;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.CustomerAddress;

public interface CustomerAddress_Service 
{

	
	List<CustomerAddress> getcustomerAddress();

	CustomerAddress savedoc(CustomerAddress customerAddress);

	

}
