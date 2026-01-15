package com.spring.employee.service;

import java.util.List;

import com.spring.employee.model.Employee;

public interface Iemployee_Service {
public Integer seveDetails(Employee e);
public List<Employee>getEmpDetails();
public void deleteByid(Integer id);
public Employee findEmpData(Integer id);
}
