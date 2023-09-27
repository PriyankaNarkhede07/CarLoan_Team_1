package com.cjc.CarLoan_TeamOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarLoanTeamOneApplication {

	public static void main(String[] args) {
		System.out.println("Car Loan project main method");
		SpringApplication.run(CarLoanTeamOneApplication.class, args);
	}

}
