package com.spring.student1App.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Student_tab")
@Data
public class Student {
	@Id
	@GeneratedValue
private Integer id;
	@Column(name="Stu_name_col")
private String name;
	@Column(name="Stu_gender_col")
	private String gender;
	@Column(name="Stu_address_col")
	private String address;
	@Column(name="Stu_contact_col")
	private String contact;
	
	@Column(name="Stu_password_col")
	private String password;
	
	@Column(name="Stu_cource_col")
	private String cource;
}
