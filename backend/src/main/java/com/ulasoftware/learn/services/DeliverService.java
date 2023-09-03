package com.ulasoftware.learn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulasoftware.learn.dto.DeliverRevisionDTO;
import com.ulasoftware.learn.entities.Deliver;
import com.ulasoftware.learn.repositories.DeliverRepository;

@Service
public class DeliverService {
	
	@Autowired
	private DeliverRepository repository;
	
	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO dto) {
		Deliver deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
	}

}
