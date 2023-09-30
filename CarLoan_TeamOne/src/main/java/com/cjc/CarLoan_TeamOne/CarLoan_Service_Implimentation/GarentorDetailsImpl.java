package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.GarentorDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.GarentorDetailsRepository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.GarentorDetailsService;

@Service
public class GarentorDetailsImpl implements GarentorDetailsService{
	
	@Autowired
	GarentorDetailsRepository garentorDetailsRepository;

	@Override
	public GarentorDetails saveGarentorDetails(GarentorDetails garentorDetails) {
		
		return garentorDetailsRepository.save(garentorDetails);
	}

	@Override
	public Iterable<GarentorDetails> getGarentorDetails() {
		
		return garentorDetailsRepository.findAll();
	}



}
