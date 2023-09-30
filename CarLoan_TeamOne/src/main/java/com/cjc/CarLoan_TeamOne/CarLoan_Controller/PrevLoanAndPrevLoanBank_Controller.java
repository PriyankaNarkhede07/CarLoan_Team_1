package com.cjc.CarLoan_TeamOne.CarLoan_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.PreviousLoan;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.*;
@RestController
@RequestMapping("/PreviousLoanDetails")
public class PrevLoanAndPrevLoanBank_Controller {
    
	@Autowired
	private PreviousLoanService PreviousLoanService;
	
	@GetMapping("/getPreviousLoan")
	public List<PreviousLoan> getPreviousloan(){ 
		return PreviousLoanService.getPreviousLoan();
		
	}
	
	@PostMapping("/addPreviousLoan")
	public PreviousLoan addPreviousLoandetails(@RequestBody PreviousLoan PreviousLoan)
	{
		return PreviousLoanService.savePreviousLoanDetails(PreviousLoan);
		
	}
	
	@PutMapping("/PreviousLoan")
	public PreviousLoan updatePreviousLoanDetails(@RequestBody PreviousLoan PreviousLoan)
	{
		return PreviousLoanService.UpdatePreviousLoanDetails(PreviousLoan);
	}
	
	
}
