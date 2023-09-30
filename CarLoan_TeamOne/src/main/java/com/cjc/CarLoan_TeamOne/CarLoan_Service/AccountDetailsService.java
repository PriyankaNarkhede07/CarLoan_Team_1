package com.cjc.CarLoan_TeamOne.CarLoan_Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AccountDetails;

public interface AccountDetailsService {

	AccountDetails saveAccountDetails(AccountDetails accountDetails);

	Iterable<AccountDetails> getAccountDetails();

}
