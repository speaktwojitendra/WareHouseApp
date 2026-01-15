package com.spring.warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.warehouse.model.OrderMethod;
import com.spring.warehouse.service.OrderMethod_Service_Interface;



@Controller
@RequestMapping("/ordermethod")
public class OrderMethodTypeController {
	
	@Autowired
	OrderMethod_Service_Interface orderServiceInter;
	
@GetMapping("/register")
public String showRegisterPage() {
	
	return "OrderMethodRegister";
	
}
@PostMapping("/save")
public String saveData(@ModelAttribute OrderMethod order,Model model) {
	orderServiceInter.saveData(order);
	
	List<OrderMethod>list=orderServiceInter.findAllData();
	model.addAttribute("list",list );
	return "OrderMethodData" ;
	
}
@GetMapping("/edit")
public String findOneData(@RequestParam Integer id,Model model) {
OrderMethod order=	orderServiceInter.findOneData(id);
model.addAttribute("obj", order);
	return "OrderMethodEdit";
}
@PostMapping("/update")
public String updateData(@ModelAttribute OrderMethod order1,Model model) {
	orderServiceInter.saveData(order1);
model.addAttribute("list", orderServiceInter.findAllData());
	
	return "OrderMethodData";
	
}
@GetMapping("/delete")
public String deleteData(@RequestParam Integer id,Model model) {
	orderServiceInter.deleteData(id);
	
	model.addAttribute("list",orderServiceInter.findAllData());
	return "OrderMethodData";
	
}


}
