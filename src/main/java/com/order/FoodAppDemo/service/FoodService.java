package com.order.FoodAppDemo.service;

import java.util.List;

import com.order.FoodAppDemo.model.AvailableMeals;
import com.order.FoodAppDemo.model.OrderDetails;


public interface FoodService {
	
	List<AvailableMeals> findAll();
	
//	OrderDetails save(OrderDetails orderDetails);

}
