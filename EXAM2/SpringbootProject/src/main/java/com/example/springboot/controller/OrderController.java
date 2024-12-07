package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.order;
import com.example.springboot.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	private OrderService service;

	@GetMapping("/")
	public String home() {
		return "Spring Boot Rest API Project";
	}
	
	@PostMapping("add")
	public String addstudent(@RequestBody order s) {
		return service.addorder(s);
	}

	@DeleteMapping("delete")
	public String deleteorder(@RequestParam("id") int sid) {
		return service.deleteOrderbyid(sid);
	}



}