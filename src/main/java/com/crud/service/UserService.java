package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.User;
import com.crud.repository.UserRepository;

@Service
public class UserService {
	@Autowired
private UserRepository userRepository;

	public List<User>getAllUser(){
		return userRepository.findAll();
		
	}
	
	public User getUserById(int id) {
		return userRepository.findById(id).get();
		
	}
	
	public User saveOrUpdate(User user) {
	return	userRepository.save(user);
		
		
	}
	public void delete(int id) {
		userRepository.deleteById(id);
	}
}
