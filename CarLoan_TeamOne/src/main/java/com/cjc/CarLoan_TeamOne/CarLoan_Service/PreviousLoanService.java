package com.cjc.CarLoan_TeamOne.CarLoan_Service;

import java.util.List;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.PreviousLoan;

public interface PreviousLoanService {

	 PreviousLoan savePreviousLoanDetails(PreviousLoan PreviousLoan);
	 List<PreviousLoan> getPreviousLoan();
	 PreviousLoan UpdatePreviousLoanDetails(PreviousLoan PreviousLoan);
}
