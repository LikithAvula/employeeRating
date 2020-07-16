package com.likith.EmployeesRating.restController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.likith.EmployeesRating.Entity.Data;
import com.likith.EmployeesRating.Entity.EmployeeRating;
import com.likith.EmployeesRating.Entity.EmployeeRatings;
import com.likith.EmployeesRating.Entity.Movie;
import com.likith.EmployeesRating.service.EmployeeRatingService;

@RestController
@RequestMapping("/ratingApi")
public class EmployeeRatingController {
	@Autowired
	EmployeeRatingService employeeRatingService;
	
	@GetMapping("/allRatings")
	public EmployeeRatings getAllRatings() {
		return employeeRatingService.getAllRatings();		
	}
	
	@GetMapping("/ratingById/{id}")
	public EmployeeRating getRatingById(@PathVariable int id) {		
		return employeeRatingService.getEmployeeRatingById(id);		
	}
	
	@DeleteMapping("/deleteById/{id}")
	public EmployeeRatings deleteEmployeeById(@PathVariable int id) {
		employeeRatingService.deleteRating(id);
		return employeeRatingService.getAllRatings();		
	}
	
	@PostMapping("/addEmployeeRating")
	public EmployeeRatings AddEmployee(@RequestBody EmployeeRating rating) {		
		employeeRatingService.addRating(rating);
		return employeeRatingService.getAllRatings();
		
	}
	
	@PutMapping("/updateEmployeeRating")
	public EmployeeRatings updateEmployee(@RequestBody EmployeeRating rating) {
		employeeRatingService.updateRating(rating);
		return employeeRatingService.getAllRatings();
		
	}
	
	@GetMapping("/byLocation/{location}")
	public EmployeeRatings emplyeesByLocation(@PathVariable String location) {
		List<EmployeeRating> list = employeeRatingService.getAllRatings().getEmployeeRatings().stream().filter(p->p.getLocation().equals(location)).collect(Collectors.toList());
		EmployeeRatings ratings = new EmployeeRatings();
		ratings.setEmployeeRatings(list);
		return ratings;
	}
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
		
	}
}
