package com.cjc.CarLoan_TeamOne.CarLoan_Service_Implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.CarLoan_TeamOne.CarLoan_Registration_Model.Profession;
import com.cjc.CarLoan_TeamOne.CarLoan_Repository.ProfessionRepository;
import com.cjc.CarLoan_TeamOne.CarLoan_Service.ProfessionService;

@Service
public class ProfessionImpl implements ProfessionService{

	@Autowired
	ProfessionRepository professionRepository;
	@Override
	public Profession savedoc(Profession profession) {
	
		return professionRepository.save(profession);
	}

	@Override
	public List<Profession> getUploadedProfessionDetails() {

		return professionRepository.findAll();
	}

}
