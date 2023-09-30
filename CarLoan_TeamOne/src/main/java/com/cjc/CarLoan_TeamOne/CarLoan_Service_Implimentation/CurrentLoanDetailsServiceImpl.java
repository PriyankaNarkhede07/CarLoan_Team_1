package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.CurrentLoanDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.CurrentLoanDetailsRepository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.CurrentLoanDetailsService;

@Service
public class CurrentLoanDetailsServiceImpl implements CurrentLoanDetailsService {
	
	@Autowired 
	CurrentLoanDetailsRepository currentLoanDetailsRepository;

	@Override
	public CurrentLoanDetails AddCurrentLoanDetails(CurrentLoanDetails cld) {
		
		return currentLoanDetailsRepository.save(cld);
	}

}
