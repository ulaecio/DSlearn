package com.ulasoftware.learn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ulasoftware.learn.dto.NotificationDTO;
import com.ulasoftware.learn.entities.Notification;
import com.ulasoftware.learn.entities.User;
import com.ulasoftware.learn.repositories.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;
	
	public Page<NotificationDTO> notificationsForCurrentUser(Boolean unReadOnly, Pageable pageable) {
	User user = authService.authenticated();
	Page<Notification> page = repository.find(user, unReadOnly, pageable);
	return page.map(x -> new NotificationDTO(x));
	}
}
