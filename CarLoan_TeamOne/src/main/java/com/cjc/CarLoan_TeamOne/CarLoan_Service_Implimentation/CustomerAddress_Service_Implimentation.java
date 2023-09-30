package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.CustomerAddress;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.CustomerAddress_Repository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.CustomerAddress_Service;

@Service
public class CustomerAddress_Service_Implimentation implements CustomerAddress_Service
{

	@Autowired
	CustomerAddress_Repository customerAddress_Repository;

	

	@Override
	public List<CustomerAddress> getcustomerAddress() 
	{
		return (List<CustomerAddress>) customerAddress_Repository.findAll();
	}



	@Override
	public CustomerAddress savedoc(CustomerAddress customerAddress) 
	{
		return customerAddress_Repository.save(customerAddress);
	}

	

}
