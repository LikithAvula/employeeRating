package com.likith.EmployeesRating;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.likith.EmployeesRating.restController.EmployeeRatingController;

@ComponentScan
public class EmployeesDriver {
	
	public static void main(String args[]) {
	ApplicationContext context = new AnnotationConfigApplicationContext(EmployeesDriver.class);
	EmployeeRatingController employeeRatingController = (EmployeeRatingController) context.getBean("employeeRatingController");
	}
	

}
