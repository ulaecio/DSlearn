package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
