package com.desafio.des.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.des.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

