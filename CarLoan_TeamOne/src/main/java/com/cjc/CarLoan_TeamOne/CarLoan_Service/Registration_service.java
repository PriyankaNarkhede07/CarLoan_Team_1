package com.cjc.CarLoan_TeamOne.CarLoan_Service;

import java.util.List;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AllPersonalDocuments;
import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.Register_customer;

public interface Registration_service {

	AllPersonalDocuments savePersonalDetails(AllPersonalDocuments allPersonalDocuments);

	List<AllPersonalDocuments> getpersonalDocuments();

	Register_customer save_registration(Register_customer customer);

	List<Register_customer> get_registration();

	

}
