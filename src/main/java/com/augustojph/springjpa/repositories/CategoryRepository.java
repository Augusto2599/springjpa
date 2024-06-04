package com.augustojph.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augustojph.springjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
