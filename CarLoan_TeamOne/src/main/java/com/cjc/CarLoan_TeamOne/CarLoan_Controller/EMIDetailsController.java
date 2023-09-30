package com.cjc.CarLoan_TeamOne.CarLoan_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.EMIDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.EMIDetailsService;

@RestController
@RequestMapping("/EMIDetails")
public class EMIDetailsController {
	@Autowired
	EMIDetailsService emiDetailsService;
	
	@PostMapping("/addEMIDetails")
	public EMIDetails emiDetails(@RequestBody EMIDetails ed)
	{
		
		EMIDetails dbed=emiDetailsService.addEMIDetails(ed);
		return dbed;
		
	}

}
