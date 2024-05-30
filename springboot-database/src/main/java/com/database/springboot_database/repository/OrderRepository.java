package com.database.springboot_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.springboot_database.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
