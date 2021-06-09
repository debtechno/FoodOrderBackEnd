package com.order.FoodAppDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.FoodAppDemo.model.AvailableMeals;
import com.order.FoodAppDemo.model.OrderDetails;
import com.order.FoodAppDemo.repository.FoodRepository;
import com.order.FoodAppDemo.repository.OrderDetailsRepository;

@Service
public class FoodServiceImpl implements FoodService {
	
	@Autowired
	FoodRepository foodRepository;
	
	@Autowired
	OrderDetailsRepository orderDetailsRepository;

	@Override
	public List<AvailableMeals> findAll() {
		return foodRepository.findAll();
	}

//	@Override
//	public OrderDetails save(OrderDetails orderDetails) {
//		orderDetailsRepository.save(orderDetails);
//		return orderDetails;
//	}

}
