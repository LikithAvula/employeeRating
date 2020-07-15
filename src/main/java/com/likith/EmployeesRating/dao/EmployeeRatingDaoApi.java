package com.likith.EmployeesRating.dao;

import com.likith.EmployeesRating.Entity.EmployeeRating;
import com.likith.EmployeesRating.Entity.EmployeeRatings;

public interface EmployeeRatingDaoApi {
	
	public EmployeeRatings getAllRatings();
	
	public EmployeeRating getRatingById(int id);
	
	public int addRating(EmployeeRating rating);
	
	public int deleteRating(int id);
	
	public void updateRating(EmployeeRating rating);

}
