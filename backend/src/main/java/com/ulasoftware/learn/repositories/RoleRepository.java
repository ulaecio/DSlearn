package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
