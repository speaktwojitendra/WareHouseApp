package com.spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jpa.entity.Student;
import com.spring.jpa.entity.Teacher;
import com.spring.jpa.repository.NewInterface;
@Component
public class Dboperation {
@Autowired
 private NewInterface newInterface;
Student student1=new Student();
Student student2=new Student();
Student student3=new Student();
public void addDetails() {
	student1.setSid(01);
	student1.setSname("jitendra");
	student2.setSid(02);
	student2.setSname("Deepak");
	student3.setSid(03);
	student3.setSname("Rudra");
	List<Student> student=List.of(student1,student2,student3);
	Teacher teacher=new Teacher();
	teacher.setTid(1000);
	teacher.setTname("Natraj");
	teacher.setStudent(student);
	newInterface.save(teacher);
	
}
}
