package com.spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="appointment")
public class AppointMent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointment_Id;


private String date;

}
