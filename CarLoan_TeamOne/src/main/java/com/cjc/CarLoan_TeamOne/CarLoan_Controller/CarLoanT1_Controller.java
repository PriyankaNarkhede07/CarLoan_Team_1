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

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.AllPersonalDocuments;
import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.Register_customer;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.Registration_service;
import com.google.gson.Gson;

@RestController
@RequestMapping("/detailsUpload")
public class CarLoanT1_Controller {
	
	@Autowired
	Registration_service registration_service;
	
	@PostMapping("/save_register_customer")
	public Register_customer save_registration(@RequestBody Register_customer customer) {
		return registration_service.save_registration(customer);
		
	}
	
	@GetMapping("/get_register_customer")
	public  List<Register_customer> get_registration() {
		return (List<Register_customer>) registration_service.get_registration();
		
	}
	
	@RequestMapping(value = "/personaldocUpload" ,method =RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public AllPersonalDocuments docsave(@RequestPart(required = true , value="bankCheque") MultipartFile f1,
										@RequestPart(required = true , value="salarySlips") MultipartFile f2,
										@RequestPart("doc") String doc) throws IOException
	{
		
		AllPersonalDocuments documents=new AllPersonalDocuments();
		
		documents.setBankCheque(f1.getBytes());
		documents.setSalarySlips(f2.getBytes());
		
		Gson g=new Gson();
		
		AllPersonalDocuments allPersonalDocuments=g.fromJson(doc,AllPersonalDocuments.class);
		
		documents.setFirstName(allPersonalDocuments.getFirstName());
		
		documents.setLastName(allPersonalDocuments.getLastName());
		
		documents.setAge(allPersonalDocuments.getAge());
		
		documents.setEmail(allPersonalDocuments.getEmail());
		
		AllPersonalDocuments saveDocuments=registration_service.savePersonalDetails(documents);
		
		return saveDocuments;
	
	}
	
	@GetMapping("/getPersonalDocs")
	public List<AllPersonalDocuments> getPersonalDocuments()
	{
		return registration_service.getpersonalDocuments();
	}

}
