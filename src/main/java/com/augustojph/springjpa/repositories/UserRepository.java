package com.augustojph.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augustojph.springjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
