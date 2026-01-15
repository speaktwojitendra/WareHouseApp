package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Operation_class {

 @Autowired
My_CurdRepository mycruCurdRepository;
   
	Employee_Details employeedtaDetails=new Employee_Details();


	public void add_Details() {
		
		employeedtaDetails.setSal1(25000);
		employeedtaDetails.setComm1(11);
		employeedtaDetails.setDeptno1(11);
		employeedtaDetails.setEmpno1(7560);
		employeedtaDetails.setEname1("sony");
	
		employeedtaDetails.setJob1("sarpanch");
		employeedtaDetails.setMgr1(7839);
		
		mycruCurdRepository.save(employeedtaDetails);
	}

}
