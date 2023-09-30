package com.cjc.CarLoan_TeamOne.CarLoan_Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.CustomerAddress;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.CustomerAddress_Service;
import com.google.gson.Gson;

@RestController
@RequestMapping("/carLoan_TeamOne")
public class CustomerAddress_Controller 
{
	@Autowired
	CustomerAddress_Service customerAddress_Service;
	
	@RequestMapping(value = "/docUpload" ,method =RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public CustomerAddress docsave(@RequestPart(required = true , value="aadharcard") MultipartFile f1,
			@RequestPart(required = true , value="pancard") MultipartFile f2,
			@RequestPart(required = true , value="voter_id") MultipartFile f3,
			@RequestPart(required = true , value="passport") MultipartFile f4,
			@RequestPart("doc") String doc) throws IOException
	{
		CustomerAddress customerAddress= new CustomerAddress();
		
		customerAddress.setAadharcard(f1.getBytes());
		customerAddress.setPancard(f2.getBytes());
		customerAddress.setVoter_id(f3.getBytes());
		customerAddress.setPassport(f4.getBytes());
		
		Gson g=new Gson();
		
		CustomerAddress customerAddress2=g.fromJson(doc, CustomerAddress.class);
		
		customerAddress.setPermanentAddress(customerAddress2.getPermanentAddress());
		customerAddress.setLocalAddress(customerAddress2.getLocalAddress());
		
		
		CustomerAddress customerAddress3=customerAddress_Service.savedoc(customerAddress);
		return customerAddress3;
	}
	
	@GetMapping("/getcustomerAddress")
	public List<CustomerAddress> getcustomerAddress()
	{
		List<CustomerAddress> ca = customerAddress_Service.getcustomerAddress();
		return (List<CustomerAddress>) ca;
	}
}
