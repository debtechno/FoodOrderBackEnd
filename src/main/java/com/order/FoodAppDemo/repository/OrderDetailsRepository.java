package com.order.FoodAppDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.FoodAppDemo.model.OrderDetails;
import com.order.FoodAppDemo.model.OrderEntity;

public interface OrderDetailsRepository extends JpaRepository<OrderEntity, Long> {

}
