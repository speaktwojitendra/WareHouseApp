package com.spring.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.employee.model.Employee;
import com.spring.employee.repository.Iemployee_Repository;

@Service
public class EmployeeServiceimpl implements Iemployee_Service {
	@Autowired
	Iemployee_Repository repo;

	@Override
	public Integer seveDetails(Employee e) {
		// TODO Auto-generated method stub
		Employee emp = repo.save(e);
		return emp.getId();
	}

	@Override
	public List<Employee> getEmpDetails() {
		// TODO Auto-generated method stub
int x=10;
		return repo.findAll();
	}

	@Override
	public void deleteByid(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Employee findEmpData(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new UserNotFoundException("User not Found" + id + "not Exist"));
	}

	public void save(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
	}

}
