package com.order.FoodAppDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.FoodAppDemo.model.AvailableMeals;

@Repository
public interface FoodRepository extends JpaRepository<AvailableMeals, Long> {

}
