package com.cjc.CarLoan_TeamOne.CarLoan_Service;

import java.util.List;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AllPersonalDocuments;

public interface Registration_service {

	AllPersonalDocuments savePersonalDetails(AllPersonalDocuments allPersonalDocuments);

	List<AllPersonalDocuments> getpersonalDocuments();

}
