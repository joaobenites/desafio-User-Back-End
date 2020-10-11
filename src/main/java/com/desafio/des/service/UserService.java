package com.desafio.des.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.desafio.des.model.User;
import com.desafio.des.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers(){
		System.out.println("aqui");
		return userRepository.findAll();
		
	}

	public User createUser(User user) {
		return userRepository.save(user);
	}
}
