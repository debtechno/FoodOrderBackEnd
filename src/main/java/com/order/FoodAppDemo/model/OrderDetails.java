package com.order.FoodAppDemo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



public class OrderDetails {
	
	private User user;
	
	private FoodItem[] items;

	private Double totalAmount;

	public FoodItem[] getItems() {
		return items;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setItems(FoodItem[] items) {
		this.items = items;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}



	
}
