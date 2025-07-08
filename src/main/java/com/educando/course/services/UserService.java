package com.educando.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educando.course.entities.User;
import com.educando.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> fillAll(){
		return repository.findAll();
	}

}
