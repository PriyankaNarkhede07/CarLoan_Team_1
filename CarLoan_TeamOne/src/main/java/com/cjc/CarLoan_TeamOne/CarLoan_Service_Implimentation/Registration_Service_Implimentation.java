package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AllPersonalDocuments;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.Registration_Repository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.Registration_service;

@Service
public class Registration_Service_Implimentation implements Registration_service{

	@Autowired
	Registration_Repository registration_Repository;
	
	@Override
	public AllPersonalDocuments savePersonalDetails(AllPersonalDocuments allPersonalDocuments) {
 		return registration_Repository.save(allPersonalDocuments);
	}

	@Override
	public List<AllPersonalDocuments> getpersonalDocuments() {
 		return registration_Repository.findAll();
	}

}
