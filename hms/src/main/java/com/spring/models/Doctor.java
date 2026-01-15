package com.spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Doctor")
public class Doctor {
	

		@Id
		@Column(name="D_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
	 private Integer doctor_id;
		@Column
	 private String doctor_name;
		@Column
	 private Integer doctor_age;
		@Column
	 private String doctor_gender;
		@Column
	 private String speciallity;
		
}
