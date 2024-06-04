package com.augustojph.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augustojph.springjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
