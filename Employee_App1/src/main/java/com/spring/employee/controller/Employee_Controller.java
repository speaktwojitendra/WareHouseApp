package com.spring.employee.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.employee.model.Employee;
import com.spring.employee.service.EmployeeServiceimpl;
import com.spring.employee.service.Iemployee_Service;

@Controller
//@RequestMapping("emp1")
public class Employee_Controller {

    private final EmployeeServiceimpl employeeServiceimpl;
@Autowired
Iemployee_Service empservice;

    Employee_Controller(EmployeeServiceimpl employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }
@PostMapping("/save")
@ResponseBody
public String saveEmployees(@ModelAttribute Employee e,Model model) {

	Integer id= empservice.seveDetails(e);
	model.addAttribute("message", "Registretion successfull");
return "Successfully Registered With id="+id;
	
}
@GetMapping("/delete")
@ResponseBody
public String deleteByid(@RequestParam Integer id) {
	empservice.deleteByid(id);
	return id+":id Deleted Successfully";	
}

@GetMapping("/register")

public String showRegister() {
	return "Registration";
}
@GetMapping("/all")
public String  getDetails(Model model) {
List<Employee>list=	empservice.getEmpDetails();
list.sort((a,b)->a.getId().compareTo(b.getId()));
model.addAttribute("list", list);
return "EmployeeData"; 
	
}
@GetMapping("/edit")
public String getempDataForEdit(@RequestParam Integer  id,Model model) {
Employee e	=empservice.findEmpData(id);
model.addAttribute("e", e);
	return "EmpEdit";
}
@PostMapping("/update")
public String updateEmployee(@ModelAttribute Employee emp,Model model) {
	employeeServiceimpl.save(emp);
	model.addAttribute("list",empservice.getEmpDetails());
	model.addAttribute("message", emp.getId()+"Successfully edited Thank You");
	return "EmployeeData";
	
}

}
