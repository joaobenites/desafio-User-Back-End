package com.desafio.des.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8577861242063701635L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private Boolean is_enabled;
	@Column
	private LocalDate register_date;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String email;
	@Column
	private String phone;
	
	public User() {}
	
	public User(String username, String password, Boolean is_enabled, LocalDate register_date, String name,
			String surname, String email, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.is_enabled = is_enabled;
		this.register_date = register_date;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIs_enabled() {
		return is_enabled;
	}
	public void setIs_enabled(Boolean is_enabled) {
		this.is_enabled = is_enabled;
	}
	public LocalDate getRegister_date() {
		return register_date;
	}
	public void setRegister_date(LocalDate register_date) {
		this.register_date = register_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
