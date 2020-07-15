package com.likith.EmployeesRating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likith.EmployeesRating.Entity.EmployeeRating;
import com.likith.EmployeesRating.Entity.EmployeeRatings;
import com.likith.EmployeesRating.dao.EmployeeRatingDaoApi;

@Service("employeeRatingService")
public class EmployeeRatingServiceImpl implements EmployeeRatingService{
	
	@Autowired
	public EmployeeRatingDaoApi employeeRatingRepo;

	@Override
	public EmployeeRatings getAllRatings() {
		
		return employeeRatingRepo.getAllRatings();
	}

	@Override
	public EmployeeRating getEmployeeRatingById(int id) {
		
		return employeeRatingRepo.getRatingById(id);
	}

	@Override
	public int addRating(EmployeeRating rating) {
		// TODO Auto-generated method stub
		return employeeRatingRepo.addRating(rating);
	}

	@Override
	public int deleteRating(int id) {
		// TODO Auto-generated method stub
		return employeeRatingRepo.deleteRating(id);
	}

	@Override
	public void updateRating(EmployeeRating rating) {
		employeeRatingRepo.updateRating(rating);
		
	}

}
