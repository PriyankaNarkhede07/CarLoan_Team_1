package com.cjc.CarLoan_TeamOne.CarLoan_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.CurrentLoanDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.EMIDetails;

public interface CurrentLoanDetailsRepository extends JpaRepository<CurrentLoanDetails, Integer> {

}
