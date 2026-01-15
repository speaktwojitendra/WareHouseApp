package com.spring.student1App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.student1App.model.Student;
import com.spring.student1App.service.StudentServiceImp;
import com.spring.student1App.service.StudentServiceInter;

@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentServiceImp studentServiceImp;
	@Autowired
	StudentServiceInter studentServiceInter;

    StudentController(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }
@GetMapping("/register")
public String showRegisterPage() {
	
	return "StudentRegister";
}

@PostMapping("/save")
public String dataSave(@ModelAttribute Student s,Model model) {
	studentServiceInter.saveOneStudent(s);
	model.addAttribute("message", "Data saved Successfully with Id="+s.getId());
	model.addAttribute("list",studentServiceInter.findAllStudentData() );
	return "StudentData";
}


@GetMapping("/edit")

public String editStudentData(@RequestParam Integer id,Model model) {
	model.addAttribute("obj", studentServiceInter.findOneStudentData(id));
	
	
	return "StudentDataEdit";
	
}
@PostMapping("/update")
public String UpdateStudentData(@ModelAttribute Student s,Model model) {
	
	studentServiceInter.saveOneStudent(s);
	model.addAttribute("list",studentServiceInter.findAllStudentData());
	return "StudentData";
}


@GetMapping("/delete")

public String deleteStudentData( @RequestParam Integer id,Model model) {
	
	studentServiceInter.deleteStudentData(id);
	model.addAttribute("list",studentServiceInter.findAllStudentData());
	return "StudentData";
	
}


	
}
