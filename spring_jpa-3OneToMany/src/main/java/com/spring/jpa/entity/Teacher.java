package com.spring.jpa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="teacher")
@Data
public class Teacher {
	@Id
private  int tid;
private String tname;
@OneToMany(cascade = CascadeType.ALL)
//@JoinColumn(name="stid")
List<Student> student;
}
