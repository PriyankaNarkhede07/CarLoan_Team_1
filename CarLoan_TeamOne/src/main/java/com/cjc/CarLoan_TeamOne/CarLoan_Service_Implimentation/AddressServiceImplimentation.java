package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.CustomerAddress;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.AddressRepository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.AddressService;

@Service
public class AddressServiceImplimentation implements AddressService{
	@Autowired
	AddressRepository addressRepository;

	@Override
	public CustomerAddress saveAddressDetails(CustomerAddress address) {
 		return addressRepository.save(address);
	}

}
