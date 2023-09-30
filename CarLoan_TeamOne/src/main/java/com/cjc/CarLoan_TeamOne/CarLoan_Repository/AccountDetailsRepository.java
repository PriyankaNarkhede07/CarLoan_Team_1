package com.cjc.CarLoan_TeamOne.CarLoan_Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AccountDetails;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer>

{
	

}