package com.augustojph.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augustojph.springjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
