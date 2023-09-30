package com.cjc.CarLoan_TeamOne.CarLoan_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.CurrentLoanDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.CurrentLoanDetailsService;

@RestController
@RequestMapping("/CurrentLoanDetails")
public class CurrentLoanDetailsController {
	
	@Autowired
	CurrentLoanDetailsService currentLoanDetailsService;
	
	@PostMapping("/AddCurrentLoanDetails")
	public CurrentLoanDetails currentLoanDetails(@RequestBody CurrentLoanDetails cld)
	{
		CurrentLoanDetails dbcld=currentLoanDetailsService.AddCurrentLoanDetails(cld);
		return dbcld;
		
	}

}
