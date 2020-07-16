package com.likith.EmployeesRating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ApplicationContext;

import com.likith.EmployeesRating.restController.EmployeeRatingController;


@SpringBootApplication
public class EmployeesRatingApplication {
	public static void main(String[] args) {
		
		//SpringApplication.run(EmployeesRatingApplication.class, args);
		SpringApplication app = new SpringApplication(EmployeesRatingApplication.class);
		app.addListeners(new ApplicationPidFileWriter("/pid/application.pid"));
		app.run(args);
		
	}

}
