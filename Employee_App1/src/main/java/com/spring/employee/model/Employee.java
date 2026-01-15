package com.spring.employee.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Employee_tab")
public class Employee {
	@Id
@GeneratedValue
	private Integer id;
@Column(name="emp_name")
	private String ename ;
@Column(name="email")
private String email;
@Column(name="emp_gender")
	private String gender;
@Column(name="emp_address")
	private String address;
@ElementCollection
@CollectionTable(name="emp_projects_tab",joinColumns = @JoinColumn(name="Employee_tab"))
	private List<String>projects;
@ElementCollection
@CollectionTable(name="emp_slots_tab",joinColumns = @JoinColumn(name="Employee_tab"))
	private List<String>slotes;
	
	
	
}
