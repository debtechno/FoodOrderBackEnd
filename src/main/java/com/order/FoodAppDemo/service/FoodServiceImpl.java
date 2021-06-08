package com.order.FoodAppDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.FoodAppDemo.model.AvailableMeals;
import com.order.FoodAppDemo.repository.FoodRepository;

@Service
public class FoodServiceImpl implements FoodService {
	
	@Autowired
	FoodRepository foodRepository;

	@Override
	public List<AvailableMeals> findAll() {
		return foodRepository.findAll();
	}

}
