package com.spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
@Data
@Entity
@Builder
@Table(name="patient")
public class Patient {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer patient_id;
	@Column
 private String name;
	@Column
 private Integer age;
	@Column
 private String gender;
	@Column
 private String address;
}
