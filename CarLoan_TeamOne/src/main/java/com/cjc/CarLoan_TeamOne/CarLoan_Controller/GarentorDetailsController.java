package com.cjc.CarLoan_TeamOne.CarLoan_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.GarentorDetails;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.GarentorDetailsService;

@RestController
@RequestMapping("/carLoan_TeamOne")
public class GarentorDetailsController {

	@Autowired
	GarentorDetailsService garentorDetailsService;
	
	@PostMapping("/saveGarentorDetails")
	public GarentorDetails saveGarentorDetails(@RequestBody GarentorDetails garentorDetails)
	{
		GarentorDetails list=garentorDetailsService.saveGarentorDetails(garentorDetails);
		return list;
	}
	
	@GetMapping("/getGarentorDetails")
	public List<GarentorDetails> getGarentorDetails()
	{
		Iterable<GarentorDetails> allData=garentorDetailsService.getGarentorDetails();
		return (List<GarentorDetails>) allData;
	}
}
