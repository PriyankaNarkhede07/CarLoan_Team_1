package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.PreviousLoan;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.PreviousLoanRepo;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.PreviousLoanService;
@Service
public class PreviousLoanServiceImpl implements PreviousLoanService {

	@Autowired
	private PreviousLoanRepo PreviousLoanRepo;
	@Override
	public PreviousLoan savePreviousLoanDetails(PreviousLoan PreviousLoan) {
		PreviousLoanRepo.save(PreviousLoan);
		return PreviousLoan;
	}

	@Override
	public List<PreviousLoan> getPreviousLoan() {
		return PreviousLoanRepo.findAll();
	} 

	@Override
	public PreviousLoan UpdatePreviousLoanDetails(PreviousLoan PreviousLoan) {
		PreviousLoanRepo.save(PreviousLoan);
		return PreviousLoan;
	}

	
	
	

}
