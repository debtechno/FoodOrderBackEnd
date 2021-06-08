package com.order.FoodAppDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.order.FoodAppDemo.service.FoodService;

import com.order.FoodAppDemo.model.AvailableMeals;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@GetMapping("/availableMeals")
	public ResponseEntity<List<AvailableMeals>> get() {
		List<AvailableMeals> availableMeals = foodService.findAll();
		return new ResponseEntity<List<AvailableMeals>>(availableMeals, HttpStatus.OK);
	}
	
	

}
