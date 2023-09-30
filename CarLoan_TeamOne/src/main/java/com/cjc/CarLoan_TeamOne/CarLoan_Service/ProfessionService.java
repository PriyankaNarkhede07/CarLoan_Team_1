package com.cjc.CarLoan_TeamOne.CarLoan_Service;

import java.util.List;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.Profession;

public interface ProfessionService {

	Profession savedoc(Profession profession);

	List<Profession> getUploadedProfessionDetails();

}
