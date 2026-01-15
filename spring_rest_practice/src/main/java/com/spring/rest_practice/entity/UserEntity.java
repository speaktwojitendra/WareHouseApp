package com.spring.rest_practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "USER_NEW")
@Data

public class UserEntity {
	@Id
	@Column(name="id")
	
	int id;
	@Column(name="name")
	String name;
	@Column(name="age")
	int age;
	@Column(name="password")
	String password;

	
	
}
