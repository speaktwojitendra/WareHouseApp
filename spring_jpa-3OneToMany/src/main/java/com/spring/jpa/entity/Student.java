package com.spring.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Sdetails")
@Data
public class Student {
	@Id
private int sid;
private String sname;


}
