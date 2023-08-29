package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
