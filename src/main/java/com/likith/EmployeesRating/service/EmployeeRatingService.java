package com.likith.EmployeesRating.service;

import com.likith.EmployeesRating.Entity.EmployeeRating;
import com.likith.EmployeesRating.Entity.EmployeeRatings;

public interface EmployeeRatingService {
	
	public EmployeeRatings getAllRatings();
	
	public EmployeeRating getEmployeeRatingById(int id);
	
	public int addRating(EmployeeRating rating);
	
	public int deleteRating(int id);
	
	public void updateRating(EmployeeRating rating);

}
