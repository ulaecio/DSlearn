package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
