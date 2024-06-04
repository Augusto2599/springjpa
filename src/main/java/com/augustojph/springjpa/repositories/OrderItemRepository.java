package com.augustojph.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augustojph.springjpa.entities.OrderItem;
import com.augustojph.springjpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
