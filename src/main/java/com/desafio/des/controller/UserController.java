package com.desafio.des.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.des.model.User;
import com.desafio.des.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {


   @Autowired
   private UserService userService;

   @GetMapping
   public ResponseEntity<Object> findAll(){
      try {
		List<User> users = userService.getUsers();
		return ResponseEntity.ok().body(users);
	} catch (Exception e) {		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar lista de usuário");
	}
   }
   
   @PostMapping
   public ResponseEntity<Object> createUser(@RequestBody User user) {
	   try {
		user = this.userService.createUser(user);
		return ResponseEntity.ok().body(user);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao criar usuário");
	}
   }
   
  @GetMapping("/delete")
  public ResponseEntity<Void> deleteUser(@Param("id") Long id) {
		try {
			this.userService.deleteUser(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
  
  @PostMapping("/update")
  public ResponseEntity<Void> updateUser(@RequestBody User user) {
		try {
			this.userService.updateUser(user);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
   
   
   
}