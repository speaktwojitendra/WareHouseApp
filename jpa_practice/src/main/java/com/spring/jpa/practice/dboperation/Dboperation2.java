package com.spring.jpa.practice.dboperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jpa.practice.entity.Department;
import com.spring.jpa.practice.entity.Employe;
import com.spring.jpa.practice.repository.DeptRepo;
import com.spring.jpa.practice.repository.EmployeeRepo;

@Component
public class Dboperation2 {

	@Autowired
	EmployeeRepo  employeerepo;
	@Autowired
	DeptRepo deptRepo;
	public void add() {
		
		Employe employe=new Employe();
		Department department=new Department();
		department.setDeptid(01);
		department.setDeptname("Clerk");
		employe.setDepartment(department);
		employe.setEid(01);
		employe.setEname("Jk");
		employeerepo.save(employe);
	}
}
