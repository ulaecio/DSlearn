package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
