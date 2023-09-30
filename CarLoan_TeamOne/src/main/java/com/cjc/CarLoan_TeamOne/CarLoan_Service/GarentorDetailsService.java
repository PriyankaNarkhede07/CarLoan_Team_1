package com.cjc.CarLoan_TeamOne.CarLoan_Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.GarentorDetails;

public interface GarentorDetailsService {


	GarentorDetails saveGarentorDetails(GarentorDetails garentorDetails);

	Iterable<GarentorDetails> getGarentorDetails();


}
