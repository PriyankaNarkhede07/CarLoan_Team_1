package com.cjc.CarLoan_TeamOne.CarLoan_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AccountDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.AccountDetailsService;

@RestController
@RequestMapping("/carLoan_TeamOne")
public class AccountDetailsController {

	@Autowired
	AccountDetailsService accountDetailsService;
	
	@PostMapping("/saveAccountDetails")
	public AccountDetails saveAccountDetails(@RequestBody AccountDetails accountDetails)
	{
		AccountDetails list=accountDetailsService.saveAccountDetails(accountDetails);
		return list;
	}
	
	@GetMapping("/getAccountDetails")
	public List<AccountDetails> getAccountDetails()
	{
		Iterable<AccountDetails> allData=accountDetailsService.getAccountDetails();
		return (List<AccountDetails>) allData;
	}
}
