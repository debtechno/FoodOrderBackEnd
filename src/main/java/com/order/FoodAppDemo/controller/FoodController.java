package com.order.FoodAppDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import com.order.FoodAppDemo.service.FoodService;

import com.order.FoodAppDemo.model.AvailableMeals;
import com.order.FoodAppDemo.model.FoodItem;
import com.order.FoodAppDemo.model.OrderDetails;
import com.order.FoodAppDemo.model.OrderEntity;
import com.order.FoodAppDemo.repository.FoodRepository;
import com.order.FoodAppDemo.repository.OrderDetailsRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class FoodController {
	
	@Autowired
	FoodService foodService;
	private FoodRepository fr;
	
	@Autowired
	OrderDetailsRepository orderRepo;
	
	@GetMapping("/availableMeals")
	public ResponseEntity<List<AvailableMeals>> get() {
		List<AvailableMeals> availableMeals = foodService.findAll();
		return new ResponseEntity<List<AvailableMeals>>(availableMeals, HttpStatus.OK);
	}
	
	@PostMapping("/orderDetails")
	public void save(@RequestBody OrderDetails orderDetails){
		FoodItem[] items=orderDetails.getItems();
		//List<OrderEntity> orders= new ArrayList<OrderEntity>();
		/*List<AvailableMeals> mealsList=new ArrayList<AvailableMeals>();
		for(FoodItem f:items) {
			Long id= f.getItemId();
			AvailableMeals av=fr.getById(id);
			mealsList.add(av);
		}*/
		for(FoodItem item:items) {
			OrderEntity order= new OrderEntity();
			order.setUserName(orderDetails.getUser().getUserName());
			order.setCity(orderDetails.getUser().getCity());
			order.setStreet(orderDetails.getUser().getStreet());
			order.setPostalCode(orderDetails.getUser().getPostalCode());
			order.setTotalAmount(orderDetails.getTotalAmount());
			order.setId(item.getId());
			order.setName(item.getName());
			order.setAmount(item.getAmount());
			order.setPrice(item.getPrice());
			orderRepo.save(order);
		}
		
//		OrderDetails orders = foodService.save(orderDetails);
		//return new ResponseEntity<OrderEntity>(orders, HttpStatus.OK);
	}
	
	

}
