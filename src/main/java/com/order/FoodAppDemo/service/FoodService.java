package com.order.FoodAppDemo.service;

import java.util.List;

import com.order.FoodAppDemo.model.AvailableMeals;


public interface FoodService {
	
	List<AvailableMeals> findAll();

}
