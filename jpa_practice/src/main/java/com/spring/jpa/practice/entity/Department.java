package com.spring.jpa.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="DEPARTMENT")
public class Department {
	@Id
private int deptid;
private String deptname;

}
