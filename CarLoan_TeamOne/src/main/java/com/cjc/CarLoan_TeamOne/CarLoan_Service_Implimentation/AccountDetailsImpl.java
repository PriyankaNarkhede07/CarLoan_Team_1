package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AccountDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.AccountDetailsRepository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.AccountDetailsService;

@Service
public class AccountDetailsImpl implements AccountDetailsService{
	
	@Autowired
	AccountDetailsRepository accountDetailsRepository;

	@Override
	public AccountDetails saveAccountDetails(AccountDetails accountDetails) {
		
		return accountDetailsRepository.save(accountDetails);
	}

	@Override
	public Iterable<AccountDetails> getAccountDetails() {
		
		return accountDetailsRepository.findAll();
	}
	


}
