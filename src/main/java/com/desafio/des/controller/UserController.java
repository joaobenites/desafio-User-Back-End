package com.desafio.des.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
   public List<User> findAll(){
      return userService.getUsers();
   }
   
   @PostMapping
   public User createUser(@RequestBody User user) {
	   user = this.userService.createUser(user);
	   return user;
   }
   
   
   
   
   
}