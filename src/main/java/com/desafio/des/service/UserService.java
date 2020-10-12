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
	
	public List<User> getUsers() throws Exception {
		System.out.println("aqui");
		return userRepository.findAll();
		
	}

	public User createUser(User user) throws Exception  {
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id) throws Exception {
		userRepository.deleteById(id);
		
	}

	public void updateUser(User user) throws Exception {
		userRepository.save(user);
		
	}
}
