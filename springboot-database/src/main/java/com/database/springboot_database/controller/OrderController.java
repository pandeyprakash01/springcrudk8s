package com.database.springboot_database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.springboot_database.entity.Order;
import com.database.springboot_database.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("hello")
	public String hello(){
		return "hi this is ";
	}
	
	 @PostMapping("/add")
	 public Order addOrder(@RequestBody Order order){
	     return orderService.addOrder(order);
	 }

	 @GetMapping
	 public List<Order> getOrders(){
        return orderService.getOrders();
     }

     @GetMapping("/{id}")
     public Order getOrderById(@PathVariable int id){
	     return orderService.getOrderById(id);
	 }

}
