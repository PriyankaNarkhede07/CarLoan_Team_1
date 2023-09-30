package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AllPersonalDocuments;
import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.Register_customer;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.Registration_Repository;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.register_customerRepository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.Registration_service;

@Service
public class Registration_Service_Implimentation implements Registration_service{

	@Autowired
	Registration_Repository registration_Repository;
	@Autowired
	register_customerRepository customerRepository;
	
	@Override
	public AllPersonalDocuments savePersonalDetails(AllPersonalDocuments allPersonalDocuments) {
 		return registration_Repository.save(allPersonalDocuments);
	}

	@Override
	public List<AllPersonalDocuments> getpersonalDocuments() {
 		return registration_Repository.findAll();
	}

	@Override
	public Register_customer save_registration(Register_customer customer) {
 		return customerRepository.save(customer);
	}

	@Override
	public List<Register_customer> get_registration() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	 
}
