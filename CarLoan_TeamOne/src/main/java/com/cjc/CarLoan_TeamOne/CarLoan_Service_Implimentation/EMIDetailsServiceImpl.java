package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.EMIDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.EMIDetailsRepositry;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.EMIDetailsService;

@Service
public class EMIDetailsServiceImpl implements EMIDetailsService {

	@Autowired
	EMIDetailsRepositry emiDetailsRepositry;

	@Override
	public EMIDetails addEMIDetails(EMIDetails ed) {
		
		return emiDetailsRepositry.save(ed);
	}
	
	
}
