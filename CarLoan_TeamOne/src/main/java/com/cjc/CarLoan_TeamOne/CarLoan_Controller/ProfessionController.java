package com.cjc.CarLoan_TeamOne.CarLoan_Controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.Profession;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.ProfessionService;
import com.google.gson.Gson;




@RestController
@RequestMapping("/carLoan_TeamOne")
public class ProfessionController {
	@Autowired
	ProfessionService professionService;
	
	@RequestMapping(value = "/docUploadProfession" ,method =RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public Profession docsave(@RequestPart(required = true , value="profession_income_proof") MultipartFile f1,
			
			@RequestPart("doc") String doc) throws IOException
	{
		Profession profession= new Profession();
		
		profession.setProfession_income_proof(f1.getBytes());
		
		Gson g=new Gson();
		
		Profession profession2=g.fromJson(doc, Profession.class);
		
		profession.setProfessiontype(profession2.getProfessiontype());
		profession.setProfession_income(profession2.getProfession_income());
		profession.setProfessionDesignation(profession2.getProfessionDesignation());
	
		Profession profession3=professionService.savedoc(profession);
		
		return profession3;
	}
	
	@GetMapping("/getUploadedProfessionDetails")
	public List<Profession> getDocuments()
	{
		return professionService.getUploadedProfessionDetails();
	}
}
