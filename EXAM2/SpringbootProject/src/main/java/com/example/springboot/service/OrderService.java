package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.order;

public interface OrderService
{
	public String addorder(order s);
	public String deleteOrderbyid(int sid);
	
}
