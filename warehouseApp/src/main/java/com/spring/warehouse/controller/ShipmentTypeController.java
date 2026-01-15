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
import com.spring.warehouse.model.ShipmentType;
import com.spring.warehouse.service.ShipmentType_Interface;

@Controller
@RequestMapping("/shipmentType")
public class ShipmentTypeController {
@Autowired
ShipmentType_Interface shipmentTtpeInterface;
@GetMapping("/register")

public String registerPage() {
	return "ShipmentTypeRegister";
}



@PostMapping("/save")

public String save(@ModelAttribute ShipmentType ship,Model model) {
	Integer id= shipmentTtpeInterface.saveShipmentType(ship);
	
	model.addAttribute("message", id);
	model.addAttribute("list",shipmentTtpeInterface.getAllShipmentType()); 
	 return "ShipmentTypeData";

	
}
@GetMapping("/delete")
public String delete(@RequestParam Integer id,Model model) {
	shipmentTtpeInterface.deleteShipmentType(id); // delete the record
    model.addAttribute("message", "ShipmentType Deleted: " + id); // success message
    model.addAttribute("list", shipmentTtpeInterface.getAllShipmentType()); // reload updated list
    return "ShipmentTypeData"; 
}
@GetMapping("/All")
public String findAll(Model model){
	List<ShipmentType>shipmentTypes= shipmentTtpeInterface.getAllShipmentType();
	model.addAttribute("list", shipmentTypes);
	 return "ShipmentTypeData";
	
}
@GetMapping("/edit")
public String showEdit(@RequestParam Integer id,Model model) {
	ShipmentType sp=shipmentTtpeInterface.getOneShipmentType(id);
	model.addAttribute("object", sp);
	return "ShipmentTypeEdit";
	
}
@PostMapping("/update")
public String update(@ModelAttribute ShipmentType st,Model model) {
	 Integer id= shipmentTtpeInterface.saveShipmentType(st);
	model.addAttribute("message", "data updated successfully"+id);
	model.addAttribute("list", shipmentTtpeInterface.getAllShipmentType());
	return "ShipmentTypeData";
}
}
