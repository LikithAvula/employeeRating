package com.likith.EmployeesRating.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import com.likith.EmployeesRating.Entity.EmployeeRating;
import com.likith.EmployeesRating.Entity.EmployeeRatings;

@Repository("employeeRatingRepo")
public class EmployeeRatingDaoImpl extends JdbcDaoSupport implements EmployeeRatingDaoApi {
	
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	void initialize(){
		setDataSource(dataSource);
	}

	@Override
	public EmployeeRatings getAllRatings() {		
		List<Map<String, Object>> employeeRatingList = getJdbcTemplate().queryForList("select * from employee_rating");
		EmployeeRatings employees = new EmployeeRatings();
		List<EmployeeRating> list = getEmployeeRating(employeeRatingList);
		employees.setEmployeeRatings(list);		
		return employees;
	}

	@Override
	public EmployeeRating getRatingById(int id) {		
		List<Map<String, Object>> employeeRatingList = getJdbcTemplate().queryForList("select * from employee_rating where id = ?", new Object[] {Integer.valueOf(id)}) ;
		List<EmployeeRating> list = getEmployeeRating(employeeRatingList);
		 return list.get(0);
	}

	@Override
	public int addRating(EmployeeRating rating) {
		// TODO Auto-generated method stub
		return getJdbcTemplate().update("insert into employee_rating values(?,?,?,?)",rating.getId(),rating.getLocation(),rating.getRating(),rating.getEmployeeId() );
	}

	@Override
	public int deleteRating(int id) {
		// TODO Auto-generated method stub
		return getJdbcTemplate().update("DELETE from employee_rating where employee_id = ?",new Object[] {Integer.valueOf(id)});
	}

	@Override
	public void updateRating(EmployeeRating rating) {
		getJdbcTemplate().update("update employee_rating set location=?, rating=?, id =? where employee_id=?", new Object[] {rating.getLocation(),rating.getRating(),rating.getId(),rating.getEmployeeId()});
		
	}
	
	
	List<EmployeeRating> getEmployeeRating(List<Map<String,Object>> maps){
		
		List<EmployeeRating> employeeList = new ArrayList<EmployeeRating>(); 
		
		for(Map<String,Object> map : maps) {
			EmployeeRating employee = new EmployeeRating();
			employee.setLocation(map.get("location").toString());
			employee.setEmployeeId(map.get("employee_id").hashCode());
			employee.setId(map.get("id").hashCode());
			employee.setRating(map.get("rating").hashCode());
			employeeList.add(employee);
			
		}
		return employeeList;
		
	}

}
