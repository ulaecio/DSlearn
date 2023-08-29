package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Deliver;

public interface DeliveryRepository extends JpaRepository<Deliver, Long>{

}
