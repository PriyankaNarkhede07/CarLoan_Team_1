package com.cjc.CarLoan_TeamOne.CarLoan_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.PreviousLoan;

public interface PreviousLoanRepo extends JpaRepository<PreviousLoan, Integer> {

}
