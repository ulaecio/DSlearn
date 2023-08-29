package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
