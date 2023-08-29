package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
