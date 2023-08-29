package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Notification;

public interface LessonRepository extends JpaRepository<Notification, Long> {

}
