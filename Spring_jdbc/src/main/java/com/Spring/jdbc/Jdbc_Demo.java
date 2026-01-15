package com.Spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class Jdbc_Demo {
	@Autowired
 JdbcTemplate template;
	String querrry="update emp set sal=20000 where empno=?";
	public void insertData(int empno) {
		template.update(querrry, empno);
		System.out.println("updated successfully");
	}
	
	public void loadData() {
		System.out.println("Data loaded successfully");
	List<EmployeeDetails> l=template.query("select * from emp", new BeanPropertyRowMapper<EmployeeDetails>(EmployeeDetails.class));
	l.forEach(e->{
	System.out.println(e.empno1+"              "+e.comm1+"                "+e.deptno1+"               "+e.ename1+"               "+e.job1+"                "+e.mgr1+"               "+e.sal1);	
	});
	System.out.println( l.get(0).job1);
	}
	
}
